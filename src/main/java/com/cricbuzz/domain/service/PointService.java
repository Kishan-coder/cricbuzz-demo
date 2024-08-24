package com.cricbuzz.domain.service;

import com.cricbuzz.domain.model.Match;
import com.cricbuzz.domain.model.Team;
import com.cricbuzz.domain.repository.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    @Autowired
    ITeamRepository teamRepository;

    public List<Team> getPointsTable(){
        return teamRepository.findAllByOrderByWinsDescNrrDesc();
    }

    public void updatePointsTable(Match match){
        Team team1 = teamRepository.getById(match.getTeamId1());
        Team team2 = teamRepository.getById(match.getTeamId2());
        team1.setPlayed(team1.getPlayed()+1);
        team2.setPlayed(team2.getPlayed()+1);
        if (match.getWinTeamId().equals(team1.getId())){
            team1.setWins(team1.getWins()+1);
            team1.setNrr(team1.getNrr()+ match.getNrr());
            team2.setNrr(team2.getNrr()- match.getNrr());
        } else{
            team2.setWins(team2.getWins()+1);
            team2.setNrr(team2.getNrr()+ match.getNrr());
            team2.setNrr(team1.getNrr()- match.getNrr());
        }
        teamRepository.saveAllAndFlush(List.of(team1, team2));
        //check
    }
}
