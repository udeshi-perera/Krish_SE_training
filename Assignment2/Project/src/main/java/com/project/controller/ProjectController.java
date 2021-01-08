package com.project.controller;

import com.commons.model.project.Project;
import com.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    /**
     * this method used to save project
     *
     * @param project project details
     * @return {@Entity Project}
     */
    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public Project save(@RequestBody Project project) {
        return projectService.save(project);
    }

    /**
     * this method used to update project
     *
     * @param project project details
     * @return {@Entity Project}
     */
    @RequestMapping(value = "/project", method = RequestMethod.PUT)
    public ResponseEntity<Project> update(@RequestBody Project project) {
        Project projectUpdate = projectService.update(project);
        return ResponseEntity.ok().body(projectUpdate);
    }

    /**
     * this method used to delete project
     *
     * @param id project id
     * @return {@Entity Project}
     */
    @RequestMapping(value = "/project", method = RequestMethod.DELETE)
    public ResponseEntity delete(@RequestParam(value = "id") int id) {
        try {
            projectService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Project deleted successfully");
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project Id is not existing");
        }
    }

    /**
     * this method used to view all projects
     *
     * @return {@List Project}
     */
    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public List<Project> fetch() {
        return projectService.fetch();
    }

    @RequestMapping(value = "/project/{project-id}", method = RequestMethod.GET)
    public ResponseEntity fetch(@PathVariable(value = "project-id") int id) {
        try {
            Project project = projectService.fetch(id);
            return ResponseEntity.status(HttpStatus.OK).body(project);
        } catch (NoSuchElementException noSuchElementException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project Id is not existing");
        }
    }

    /**
     * this method used to view all active projects
     *
     * @param status status of project
     * @return {@List Project}
     */
    @RequestMapping(value = "/project-status", method = RequestMethod.GET)
    public List<Project> fetchByStatus(String status) {
        return projectService.fetchActiveProject(status);
    }

    /**
     * this method used to view all projects for a given date
     *
     * @param date start date of the project
     * @return {@ResponseEntity}
     */
    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ResponseEntity projectByStartDate(@RequestParam(value = "startDate") String date) {
        try {
            List<Project> projects = projectService.viewProjectByStartDate(LocalDate.parse(date));
            return ResponseEntity.status(HttpStatus.OK).body(projects);
        } catch (DateTimeException dateTimeException) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Given date is not correct");
        }

    }
}
