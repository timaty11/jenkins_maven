package com.dao;

import com.dal.ProjectDAL;
import com.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDAOImpl implements ProjectDAO {

    @Autowired
    private ProjectDAL dal;

    @Override
    public List<Project> getAllProjects() {
        return (List) dal.findAll();
    }

    @Override
    public Project getProjectById(int id) {
        return dal.findById(id).orElse(null);
    }

    @Override
    public Project getProjectByNameAndLoc(String name, String loc) {
        System.out.println(name);
        System.out.println(loc);
        return dal.getProjectByNameAndLocation(name, loc);
    }

    @Override
    public void addProject(Project project) {
        dal.save(project);
    }

    @Override
    public String updateProject(int id, Project project) {
        dal.updateProject(project.getProjectLocation(), project.getProjectName(), id);
        return "nice updated!";
    }

    @Override
    public String deleteProject(int id) {
        dal.deleteById(id);
        return "not nice anymore!";
    }

}
