package com.cricbuzz.domain.service;

import com.cricbuzz.domain.model.Match;
import com.cricbuzz.domain.repository.IMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    IMatchRepository matchRepository;

    public List<Match> getLastNMatchesByTeamId(Integer teamId, Integer n){
        return matchRepository.findAllByTeamId1OrTeamId2OrderByDateDesc(teamId, teamId, PageRequest.of(0, n));
    }
}
