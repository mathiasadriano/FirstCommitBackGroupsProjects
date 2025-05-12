package com.groupal.projects.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProjectDTO(
        @Schema(description = "Nombre del proyecto", example = "Mi Proyecto", required = true)
        @NotBlank(message = "El nombre del proyecto es obligatorio")
        @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
        String name,

        @Schema(description = "Descripción del proyecto", example = "Una descripción detallada")
        String description
) {}