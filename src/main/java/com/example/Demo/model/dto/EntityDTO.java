package com.example.Demo.model.dto;

import com.example.Demo.model.dao.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EntityDTO {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Description cannot be blank")
    @Size(min = 1, max = 50, message = "Description must be between 1 and 50 characters")
    private String description;

    @Enumerated(EnumType.STRING)
    private Entity.EntityType entityType;

    public Entity.EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(Entity.EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityDTO(String name, String description,Entity.EntityType entityType) {
        this.name = name;
        this.description = description;
        this.entityType = entityType;
    }
    public EntityDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
