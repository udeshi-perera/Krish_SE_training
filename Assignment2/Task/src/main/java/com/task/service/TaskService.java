package com.task.service;

import com.commons.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TaskService {

    Task save(Task task);

    Task update(Task task);

    Task delete(Integer id);

    List<Task> fetch();

    Optional<Task> fetch(Integer id);

    List<Task> getActiveTask(String status);

    List<Task> getProjectTask(Integer projectId);
}
