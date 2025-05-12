package com.groupal.projects.core.repositories;

import com.groupal.projects.core.model.Project;
import java.util.Optional;

public interface ProjectRepository {
    Project save(Project project);
    Optional<Project> findById(Long id);
}