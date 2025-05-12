package com.groupal.projects.interfaces.rest;

import com.groupal.projects.application.dto.ProjectDTO;
import com.groupal.projects.application.usecases.ProjectService;
import com.groupal.projects.core.model.Project;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
@Tag(name = "Projects", description = "API para gestión de proyectos")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    @Operation(
            summary = "Crear un proyecto",
            description = "Crea un nuevo proyecto con nombre y descripción",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Proyecto creado"),
                    @ApiResponse(responseCode = "400", description = "Datos inválidos")
            }
    )
    public Project createProject(@RequestBody @Valid ProjectDTO dto) {
        return projectService.createProject(dto.name(), dto.description());
    }
}