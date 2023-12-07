package com.project.Job.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class JobApplication {
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Job job;
}
