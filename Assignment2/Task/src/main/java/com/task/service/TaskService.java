package com.task.service;

import com.commons.model.task.Task;

import java.util.List;

public interface TaskService {

    Task save(Task task);

    Task update(Task task);

    Task delete(int id);

    List<Task> fetch();

    Task fetch(int id);

    List<Task> getActiveTask(String status);

    List<Task> getProjectTask(int projectId, String status);

    List<Task> getProjectByEmpId(String empId);
}
