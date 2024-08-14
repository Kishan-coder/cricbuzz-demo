package com.cricbuzz.domain.repository;

import com.cricbuzz.domain.model.Match;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatchRepository extends JpaRepository<Match, Integer> {
    List<Match> findAllByTeamId1OrTeamId2OrderByDateDesc(Integer id, Integer id2, Pageable pageable);
}
