package com.project.controller;

import com.commons.model.Project;
import com.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public Project save(@RequestBody Project project) {
        return projectService.save(project);
    }

    @RequestMapping(value = "/project", method = RequestMethod.PUT)
    public Project update(@RequestBody Project project) {
        try {
            return projectService.update(project);
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project ID is invalid");
        }
    }

    @RequestMapping(value = "/project", method = RequestMethod.DELETE)
    public Project delete(@RequestParam(value = "id") Integer id) {
        try {
            return projectService.delete(id);
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project ID is invalid");
        }
    }

    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public List<Project> fetch() {
        return projectService.fetch();
    }

    @RequestMapping(value = "/project/{project-id}", method = RequestMethod.GET)
    public Project fetch(@PathVariable(value = "project-id") Integer id) {
        try {
            return projectService.fetch(id);
        } catch (NullPointerException nullPointerException) {
            throw new NullPointerException("Project Id is invalid");
        }
    }

    @RequestMapping(value = "/project-status", method = RequestMethod.GET)
    public List<Project> fetchByStatus(String status) {
        return projectService.fetchActiveProject(status);
    }
}
