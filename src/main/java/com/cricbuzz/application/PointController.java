package com.cricbuzz.application;

import com.cricbuzz.domain.model.Match;
import com.cricbuzz.domain.model.Team;
import com.cricbuzz.domain.service.PointService;
import com.cricbuzz.infrastructure.model.PostMatchRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/v1/point")
public class PointController {
    @Autowired
    PointService pointService;

    @GetMapping
    public List<Team> getPointsTable(){
        return pointService.getPointsTable();
    }

    @PostMapping
    public void updatePointsTable(@RequestBody PostMatchRequestDTO postMatchRequestDTO){
        //mapping logic, can be moved to dedicated class
        Match match = new Match();
        match.setTeamId1(Integer.parseInt(postMatchRequestDTO.getTeam1().getId()));
        match.setTeamId2(Integer.parseInt(postMatchRequestDTO.getTeam2().getId()));
        if (postMatchRequestDTO.getResult().equals("1-0"))
            match.setWinTeamId(Integer.parseInt(postMatchRequestDTO.getTeam1().getId()));
        else if (postMatchRequestDTO.getResult().equals("0-1"))
            match.setWinTeamId(Integer.parseInt(postMatchRequestDTO.getTeam2().getId()));
        match.setNrr(Double.parseDouble(postMatchRequestDTO.getNrrDelta()));
         pointService.updatePointsTable(match);
    }
}
