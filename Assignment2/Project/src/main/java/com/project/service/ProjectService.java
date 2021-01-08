package com.project.service;

import com.commons.model.Project;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project update(Project project);

    Project delete(Integer id);

    List<Project> fetch();

    Project fetch(Integer id);

    List<Project> fetchActiveProject(String status);
}
