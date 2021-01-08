package com.commons.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;

    private String projectName;

    private String status;
}
