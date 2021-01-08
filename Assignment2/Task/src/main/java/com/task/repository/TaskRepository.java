package com.task.repository;

import com.commons.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAllByStatus(String status);

    List<Task> findAllByProjectId(Integer projectId);
}
