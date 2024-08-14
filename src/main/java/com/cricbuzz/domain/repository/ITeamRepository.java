package com.cricbuzz.domain.repository;

import com.cricbuzz.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Integer> {
    List<Team> findAllByOrderByWinsDescNrrDesc();
}
