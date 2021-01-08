package com.task.service.serviceImpl;


import com.commons.model.Task;
import com.task.repository.TaskRepository;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task save(Task task) {
        task.setStatus("ACTIVE");
        return taskRepository.save(task);
    }

    @Override
    public Task update(Task task) {
        task.setStatus("ACTIVE");
        return taskRepository.save(task);
    }

    @Override
    public Task delete(Integer id) {
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
    public Optional<Task> fetch(Integer id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getActiveTask(String status) {
        return taskRepository.findAllByStatus("ACTIVE");
    }

    @Override
    public List<Task> getProjectTask(Integer projectId) {
        return taskRepository.findAllByProjectId(projectId);
    }
}
