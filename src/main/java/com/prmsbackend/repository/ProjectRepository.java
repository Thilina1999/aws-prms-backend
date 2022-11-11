package com.prmsbackend.repository;

import com.prmsbackend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

     List<Project> findByUserId(String userId);
}
