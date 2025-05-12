package com.groupal.projects.infrastructure.persistence;

import com.groupal.projects.core.model.Project;
import com.groupal.projects.core.repositories.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectJpaRepository extends
        JpaRepository<Project, Long>,
        ProjectRepository {}