package com.cricbuzz.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Match{
    @Id
    private Integer id;
    @Column(name = "team_id1")
    private Integer teamId1;
    @Column (name = "team_id2")
    private Integer teamId2;
    @Column (name = "winteam_id")
    private Integer winTeamId;
    private Double nrr;
    private Date date;
}
