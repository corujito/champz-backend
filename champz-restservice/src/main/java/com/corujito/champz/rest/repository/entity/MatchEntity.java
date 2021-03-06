package com.corujito.champz.rest.repository.entity;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import com.corujito.champz.rest.model.MatchStatus;

@Document(collection = "matches")
public class MatchEntity extends BaseEntity {

    private int homeScore;
    private int awayScore;
    private int homeExtraTimeScore;
    private int awayExtraTimeScore;
    private Integer homePenaltyScore;
    private Integer awayPenaltyScore;
    private int round;
    private Date originalDate;
    private Date matchDate;
    private String locale;
    private String title;
    private String subTitle;
    private String homeTeamLabel;
    private String awayTeamLabel;
    private MatchStatus matchStatus;

    private String seasonId;
    private String phaseId;
    private String groupId;
    private String homeTeamId;
    private String awayTeamId;

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getHomeExtraTimeScore() {
        return homeExtraTimeScore;
    }

    public void setHomeExtraTimeScore(int homeExtraTimeScore) {
        this.homeExtraTimeScore = homeExtraTimeScore;
    }

    public int getAwayExtraTimeScore() {
        return awayExtraTimeScore;
    }

    public void setAwayExtraTimeScore(int awayExtraTimeScore) {
        this.awayExtraTimeScore = awayExtraTimeScore;
    }

    public Integer getHomePenaltyScore() {
        return homePenaltyScore;
    }

    public void setHomePenaltyScore(Integer homePenaltyScore) {
        this.homePenaltyScore = homePenaltyScore;
    }

    public Integer getAwayPenaltyScore() {
        return awayPenaltyScore;
    }

    public void setAwayPenaltyScore(Integer awayPenaltyScore) {
        this.awayPenaltyScore = awayPenaltyScore;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Date getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(Date originalDate) {
        this.originalDate = originalDate;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public MatchStatus getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(MatchStatus status) {
        this.matchStatus = status;
    }

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getHomeTeamLabel() {
        return homeTeamLabel;
    }

    public void setHomeTeamLabel(String homeTeamLabel) {
        this.homeTeamLabel = homeTeamLabel;
    }

    public String getAwayTeamLabel() {
        return awayTeamLabel;
    }

    public void setAwayTeamLabel(String awayTeamLabel) {
        this.awayTeamLabel = awayTeamLabel;
    }

    public MatchEntity withId(String id) {
        setId(id);
        return this;
    }

    public MatchEntity withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    public MatchEntity withTitle(String title) {
        setTitle(title);
        return this;
    }

    public MatchEntity withSubTitle(String subTitle) {
        setSubTitle(subTitle);
        return this;
    }

    public MatchEntity withSeasonId(String seasonId) {
        setSeasonId(seasonId);
        return this;
    }

    public MatchEntity withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    public MatchEntity withHomeTeamId(String homeTeamId) {
        setHomeTeamId(homeTeamId);
        return this;
    }

    public MatchEntity withAwayTeamId(String awayTeamId) {
        setAwayTeamId(awayTeamId);
        return this;
    }

    public MatchEntity withHomeScore(int homeScore) {
        setHomeScore(homeScore);
        return this;
    }

    public MatchEntity withAwayScore(int awayScore) {
        setAwayScore(awayScore);
        return this;
    }

    public MatchEntity withHomeExtraTimeScore(int homeExtraTimeScore) {
        setHomeExtraTimeScore(homeExtraTimeScore);
        return this;
    }

    public MatchEntity withAwayExtraTimeScore(int awayExtraTimeScore) {
        setAwayExtraTimeScore(awayExtraTimeScore);
        return this;
    }

    public MatchEntity withHomePenaltyScore(Integer homePenaltyScore) {
        setHomePenaltyScore(homePenaltyScore);
        return this;
    }

    public MatchEntity withAwayPenaltyScore(Integer awayPenaltyScore) {
        setAwayPenaltyScore(awayPenaltyScore);
        return this;
    }

    public MatchEntity withRound(int round) {
        setRound(round);
        return this;
    }

    public MatchEntity withOriginalDate(Date originalDate) {
        setOriginalDate(originalDate);
        return this;
    }

    public MatchEntity withMatchDate(Date matchDate) {
        setMatchDate(matchDate);
        return this;
    }

    public MatchEntity withMatchStatus(MatchStatus matchStatus) {
        setMatchStatus(matchStatus);
        return this;
    }

    public MatchEntity withPhaseId(String phaseId) {
        setPhaseId(phaseId);
        return this;
    }

    public MatchEntity withHomeTeamLabel(String homeTeamLabel) {
        setHomeTeamLabel(homeTeamLabel);
        return this;
    }

    public MatchEntity withAwayTeamLabel(String awayTeamLabel) {
        setAwayTeamLabel(awayTeamLabel);
        return this;
    }
}
