package com.commons.model.task;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String taskName;

    private int projectId;

    private String assignedPersonId;

    private String assignedPersonName;

    private String status;

    private String projectName;
}
