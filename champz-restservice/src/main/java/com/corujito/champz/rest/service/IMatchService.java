package com.corujito.champz.rest.service;

import java.util.List;
import com.corujito.champz.rest.model.Match;

public interface IMatchService {

    Match getMatch(String id);

    Match getMatchBySeasonIdAndPhaseIdAndGroupIdAndHomeTeamIdAndAwayTeamIdAndRound(String seasonId, String phaseId,
            String groupId, String homeTeamId, String awayTeamId, int round);

    List<Match> getAllMatches();

    List<Match> getMatchesBySeasonId(String seasonId);

    Match addMatch(Match match);

    Match updateMatch(Match match);

    void deleteMatch(String id);
}
