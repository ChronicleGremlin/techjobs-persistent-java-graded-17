package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    // mapping?
//    @OneToMany(mappedBy = "employer")
//    private final List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Field must have one valid name entered")
    @Size(min = 3, max = 50, message = "Field must be between 3 and 50 characters")
    private String location;

    public Employer(@NotBlank(message = "Field must have one valid name entered")
                    @Size(min = 3, max = 50, message = "Field must be between 3 and 50 characters") String location) {
        this.location = location;
    }

    public Employer () {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
