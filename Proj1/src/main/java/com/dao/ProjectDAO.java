package com.dao;

import com.entity.Project;

import java.util.List;


public interface ProjectDAO {

    public void addProject(Project project);
    public List<Project> getAllProjects();
    public Project getProjectById(int id);
    public Project getProjectByNameAndLoc(String name, String loc);
    public String updateProject(int id, Project project);
    public String deleteProject(int id);

}
