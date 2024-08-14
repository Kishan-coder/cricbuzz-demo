package com.cricbuzz.application;

import com.cricbuzz.domain.model.Match;
import com.cricbuzz.domain.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Version;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping("lastN")
    public List<Match> getMatch(@RequestParam Integer teamId, @RequestParam Integer n){
        return matchService.getLastNMatchesByTeamId(teamId, n);
    }

}
