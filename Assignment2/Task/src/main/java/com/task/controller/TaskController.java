package com.task.controller;

import com.commons.model.task.Task;
import com.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody Task task) {
        Task newTask = taskService.save(task);
        try {
            if (task.getStatus().equals("ACTIVE")) {
                return ResponseEntity.ok().body(newTask);
            } else {
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Project Status is deactive.");
            }
        } catch (NullPointerException nullPointerException) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Project id is not exists");
        }
    }

    @RequestMapping(value = "/task", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Task task) {
        Task updatedTask = taskService.update(task);
        try {
            if (task.getStatus().equals("ACTIVE")) {
                return ResponseEntity.ok().body(updatedTask);
            } else {
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Project Status is deactive.");
            }
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project id is not exists");
        }
    }

    /**
     * this method used to delete tasks
     *
     * @param id task id
     * @return {@Entity Task}
     */
    @RequestMapping(value = "/task", method = RequestMethod.DELETE)
    public ResponseEntity delete(@RequestParam(value = "id") int id) {
        try {
            taskService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Task deleted successfully");
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project Id is not existing");
        }
    }

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public List<Task> fetch() {
        return taskService.fetch();
    }

    @RequestMapping(value = "/task/{task-id}", method = RequestMethod.GET)
    public ResponseEntity fetch(@PathVariable(value = "task-id") int id) {
        try {
            Task task = taskService.fetch(id);
            return ResponseEntity.status(HttpStatus.OK).body(task);
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task Id is not existing");
        }
    }

    @RequestMapping(value = "/active-task", method = RequestMethod.GET)
    public List<Task> fetchActiveTask(String status) {
        return taskService.getActiveTask(status);
    }

    @RequestMapping(value = "/project-task", method = RequestMethod.GET)
    public ResponseEntity fetchProjectTask(@RequestParam(value = "id") int id, String status) {
        try {
            List<Task> tasks = taskService.getProjectTask(id, status);
            return ResponseEntity.status(HttpStatus.OK).body(tasks);
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task Id is not existing");
        }
    }

    @RequestMapping(value = "/task-by-id", method = RequestMethod.GET)
    public ResponseEntity fetchTasksByEmpId(@RequestParam(value = "empId") String empId) {
        try {
            List<Task> tasks = taskService.getProjectByEmpId(empId);
            return ResponseEntity.status(HttpStatus.OK).body(tasks);
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee Id is not existing");
        }
    }
}
