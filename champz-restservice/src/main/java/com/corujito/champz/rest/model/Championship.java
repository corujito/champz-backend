package com.corujito.champz.rest.model;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Championship {

    @NotNull(groups = {Existing.class, Season.New.class, Season.Existing.class})
    @Null(groups = New.class)
    private String id;
    @NotNull
    @NotBlank
    private String name;
    private String popularName;
    private String description;
    private String imageUrl;
    private String organization;
    private String founded;
    private String webSite;
    private ChampionshipType type;

    @NotNull(groups = {Existing.class, New.class})
    @Valid
    private User user;
    private List<Season> seasons;

    public interface Existing {
    }

    public interface New {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public ChampionshipType getType() {
        return type;
    }

    public void setType(ChampionshipType type) {
        this.type = type;
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = popularName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Championship withId(String id) {
        setId(id);
        return this;
    }

    public Championship withName(String name) {
        setName(name);
        return this;
    }

    public Championship withPopularName(String popularName) {
        setPopularName(popularName);
        return this;
    }

    public Championship withDescription(String description) {
        setDescription(description);
        return this;
    }

    public Championship withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    public Championship withOrganization(String organization) {
        setOrganization(organization);
        return this;
    }

    public Championship withFounded(String founded) {
        setFounded(founded);
        return this;
    }

    public Championship withWebSite(String webSite) {
        setWebSite(webSite);
        return this;
    }

    public Championship withType(ChampionshipType type) {
        setType(type);
        return this;
    }

    public Championship withUser(User user) {
        setUser(user);
        return this;
    }

    public Championship withSeasons(List<Season> seasons) {
        setSeasons(seasons);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("ID", this.id)
                .append("name", this.name)
                .append("popularName", this.popularName)
                .append("description", this.description)
                .append("founded", this.founded)
                .append("imageUrl", this.imageUrl)
                .append("type", this.type)
                .append("organization", this.organization)
                .append("webSite", this.webSite)
                .append("seasons", this.seasons)
                .append("user", this.user)
                .toString();
    }
}
