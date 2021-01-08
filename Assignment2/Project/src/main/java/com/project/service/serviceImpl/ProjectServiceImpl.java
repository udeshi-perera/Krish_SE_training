package com.project.service.serviceImpl;

import com.commons.model.project.Project;
import com.project.repository.ProjectRepository;
import com.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
        Optional<Project> optionalProject = this.projectRepository.findById(project.getId());
        // if(optionalProject.isPresent()){
//            //project.setStatus("ACTIVE");
//            Project projectUpdated=projectRepository.save(project);
//            //return projectRepository.save(project);
//            return ResponseEntity.ok().body(projectUpdated);
//
//        }
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("jj");
//        else{
//            return projectRepository.
//        }
        project.setId(project.getId());
        project.setStatus("ACTIVE");
        Project projectUpdate = projectRepository.save(project);
        return projectUpdate;

    }

    @Override
    public Project delete(int id) {
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
    public Project fetch(int id) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        return projectOptional.get();
    }

    @Override
    public List<Project> fetchActiveProject(String status) {
        return projectRepository.findAllByStatus("ACTIVE");
    }

    @Override
    public List<Project> viewProjectByStartDate(LocalDate date) {
        return projectRepository.findByStartDate(date);
    }


}
