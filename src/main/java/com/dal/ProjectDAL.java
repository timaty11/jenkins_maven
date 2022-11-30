package com.dal;

import com.entity.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProjectDAL extends CrudRepository<Project, Integer>{

    @Transactional
    @Modifying
    @Query("UPDATE Project p SET p.projectLocation=?1, p.projectName=?2 WHERE p.projectId=?3")
    public int updateProject(String location, String name, int id);


    @Query("SELECT p FROM Project p WHERE p.projectName=?1 and p.projectLocation=?2")
    public Project getProjectByNameAndLocation(String name, String location);

}
