package com.corujito.champz.rest.service;

import java.util.List;
import com.corujito.champz.rest.model.Team;

public interface ITeamService {

    Team getTeam(String id);

    List<Team> getAllTeams();

    Team addTeam(Team team);

    Team updateTeam(Team team);

    void deleteTeam(String id);
}
