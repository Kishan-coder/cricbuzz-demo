package com.cricbuzz.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Team{
    @Id
    private Integer id;
    private String name;
    @Column(name = "p")
    private Integer played;
    @Column(name = "w")
    private Integer wins;
    private Double nrr;
}
