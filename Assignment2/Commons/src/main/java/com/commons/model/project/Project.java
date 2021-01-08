package com.commons.model.project;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue
    private int id;

    private String projectName;

    private String status;

    private LocalDate startDate;

    private LocalDate endDate;
}
