package com.commons.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String taskName;

    private Integer projectId;

    private String assignedPersonId;

    private String assignedPersonName;

    private String status;

    private String projectName;
}
