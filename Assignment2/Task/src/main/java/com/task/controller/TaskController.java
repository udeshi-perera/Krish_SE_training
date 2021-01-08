package com.task.controller;

import com.commons.model.Project;
import com.commons.model.Task;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public Task save(@RequestBody Task task) {
        Project project = restTemplate.getForObject("http://localhost:8080/project/" + task.getProjectId(), Project.class);
        String projectStatus = project.getStatus();
        task.setProjectName(project.getProjectName());
        try {
            if (projectStatus.equals("ACTIVE")) {
                return taskService.save(task);
            }
            return task;
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project is not active");
        }
    }

    @RequestMapping(value = "/task", method = RequestMethod.PUT)
    public Task update(@RequestBody Task task) {
        Project project = restTemplate.getForObject("http://localhost:8080/project/" + task.getProjectId(), Project.class);
        String projectStatus = project.getStatus();
        try {
            if (projectStatus.equals("ACTIVE")) {
                return taskService.update(task);
            }
            return task;
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project id is not active");
        }
    }

    /**
     * this method used to delete tasks
     *
     * @param id task id
     * @return {@Entity Task}
     */
    @RequestMapping(value = "/task", method = RequestMethod.DELETE)
    public Task delete(@RequestParam(value = "id") Integer id) {
        if (id != null) {
            return taskService.delete(id);
        }
        throw new NoSuchElementException("Id doesnt exists");
    }

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public List<Task> fetch() {
        return taskService.fetch();
    }

    @RequestMapping(value = "/task/{task-id}", method = RequestMethod.GET)
    public Optional<Task> fetch(@PathVariable(value = "task-id") Integer id) {
        return taskService.fetch(id);
    }

    @RequestMapping(value = "/active-task", method = RequestMethod.GET)
    public List<Task> fetchActiveTask(String status) {
        return taskService.getActiveTask(status);
    }

    @RequestMapping(value = "/project-task", method = RequestMethod.GET)
    public List<Task> fetchProjectTask(@RequestParam(value = "id") Integer id) {
        return taskService.getProjectTask(id);
    }
}
