package com.groupal.projects.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;


    protected Project() {}


    public Project(String name, String description, ProjectStatus status) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.status = status;
    }
}