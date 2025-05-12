package com.groupal.projects.interfaces.api;

import com.groupal.projects.application.dto.ProjectDTO;
import com.groupal.projects.core.model.Project;
import com.groupal.projects.core.model.ProjectStatus;

public class ProjectMapper {
    public static Project toDomain(ProjectDTO dto) {
        return new Project(
                dto.name(),
                dto.description(),
                ProjectStatus.ACTIVE
        );
    }
}