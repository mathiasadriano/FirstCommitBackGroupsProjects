package com.groupal.projects.application.usecases;

import com.groupal.projects.core.model.Project;
import com.groupal.projects.core.model.ProjectStatus;
import com.groupal.projects.core.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public Project createProject(String name, String description) {
        Project project = new Project(
                name,
                description,
                ProjectStatus.ACTIVE
        );
        return repository.save(project);
    }
}