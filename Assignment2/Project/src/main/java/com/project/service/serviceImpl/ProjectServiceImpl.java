package com.project.service.serviceImpl;

import com.commons.model.Project;
import com.project.repository.ProjectRepository;
import com.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project save(Project project) {
        project.setStatus("ACTIVE");
        return projectRepository.save(project);
    }

    @Override
    public Project update(Project project) {
        project.setStatus("ACTIVE");
        return projectRepository.save(project);
    }

    @Override
    public Project delete(Integer id) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        Project project = projectOptional.get();
        project.setStatus("DEACTIVE");
        return projectRepository.save(project);
    }

    @Override
    public List<Project> fetch() {
        return projectRepository.findAll();
    }

    @Override
    public Project fetch(Integer id) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        return projectOptional.get();
    }

    @Override
    public List<Project> fetchActiveProject(String status) {
        return projectRepository.findAllByStatus("ACTIVE");
    }


}
