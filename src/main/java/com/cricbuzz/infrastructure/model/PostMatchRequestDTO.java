package com.cricbuzz.infrastructure.model;

import lombok.Data;

@Data
public class PostMatchRequestDTO {
    TeamDTO team1;
    TeamDTO team2;
    String result;
    String matchDate;
    String nrrDelta;
}
