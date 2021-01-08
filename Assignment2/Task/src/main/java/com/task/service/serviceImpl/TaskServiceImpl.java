package com.task.service.serviceImpl;


import com.commons.model.project.Project;
import com.commons.model.task.Task;
import com.task.repository.TaskRepository;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Task save(Task task) {
        Project project = restTemplate.getForObject("http://localhost:8080/project/" + task.getProjectId(), Project.class);
        task.setStatus(project.getStatus());
        task.setProjectName(project.getProjectName());
        return taskRepository.save(task);
    }

    @Override
    public Task update(Task task) {
        Project project = restTemplate.getForObject("http://localhost:8080/project/" + task.getProjectId(), Project.class);
        task.setStatus(project.getStatus());
        task.setProjectName(project.getProjectName());
        return taskRepository.save(task);
    }

    @Override
    public Task delete(int id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        Task task = optionalTask.get();
        task.setStatus("DEACTIVE");
        return taskRepository.save(task);
    }

    @Override
    public List<Task> fetch() {
        return taskRepository.findAll();
    }

    @Override
    public Task fetch(int id) {
        Optional<Task> optionalTask = taskRepository.findById(id);
        return optionalTask.get();
    }

    @Override
    public List<Task> getActiveTask(String status) {
        return taskRepository.findAllByStatus("ACTIVE");
    }

    @Override
    public List<Task> getProjectTask(int projectId, String status) {
        return taskRepository.findAllByProjectIdAndStatus(projectId, "ACTIVE");
    }

    @Override
    public List<Task> getProjectByEmpId(String empId) {
        return taskRepository.findByAssignedPersonId(empId);
    }
}
