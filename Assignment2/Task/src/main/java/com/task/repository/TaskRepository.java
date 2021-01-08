package com.task.repository;

import com.commons.model.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAllByStatus(String status);

    List<Task> findAllByProjectIdAndStatus(int projectId, String status);

    List<Task> findByAssignedPersonId(String empId);
}
