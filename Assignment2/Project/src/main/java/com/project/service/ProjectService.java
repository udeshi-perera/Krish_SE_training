package com.project.service;

import com.commons.model.project.Project;

import java.time.LocalDate;
import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project update(Project project);

    Project delete(int id);

    List<Project> fetch();

    Project fetch(int id);

    List<Project> fetchActiveProject(String status);

    List<Project> viewProjectByStartDate(LocalDate date);
}
