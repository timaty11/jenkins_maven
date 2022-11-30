package com.controller;

import com.entity.Project;
import com.dao.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/project")
public class AppController {

    @Autowired
    private ProjectDAO projectDAO;

    @GetMapping("/")
    public List<Project> getAllProjects() {
        System.out.println("mem");
        return projectDAO.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectDAO.getProjectById(id);
    }

    @GetMapping("/locname")
    public Project getProjectById(@RequestBody Project projectData) {
        return projectDAO.getProjectByNameAndLoc(projectData.getProjectName(), projectData.getProjectLocation());
    }

    @PostMapping("/add")
    public String addProject(@RequestBody Project project) {
        projectDAO.addProject(project);
        return "nice";
    }

    @PutMapping("/{id}")
    public String updateProjectById(@PathVariable int id, @RequestBody Project project) {
        return projectDAO.updateProject(id, project);
    }

    @DeleteMapping("/{id}")
    public String deleteProjectById(@PathVariable int id) {
        return projectDAO.deleteProject(id);
    }

}
