package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APEX_PROJECT")
public class Project {

    @Id
    @Column(name = "p_id")
    private int projectId;

    @Column(name = "p_name")
    private String projectName;

    @Column(name = "p_loc")
    private String projectLocation;

    public Project(int projectId, String projectName, String projectLocation) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectLocation = projectLocation;
    }

    public Project() {
        super();
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectLocation='" + projectLocation + '\'' +
                '}';
    }

}
