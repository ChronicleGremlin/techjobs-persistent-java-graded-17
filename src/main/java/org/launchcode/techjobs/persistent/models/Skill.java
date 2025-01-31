package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Field must have valid name entered")
    @Size(min = 3, max = 100, message = "Field must be between 3 and 100 characters")
    private String description;

    public Skill (@NotBlank(message = "Field must have valid name entered")
                 @Size(min = 3, max = 50, message = "Field must be between 3 and 100 characters") String description) {
        this.description = description;
    }

    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
