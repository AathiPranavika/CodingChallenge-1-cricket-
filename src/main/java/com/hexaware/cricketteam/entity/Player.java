package com.hexaware.cricketteam.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @Column(name = "player_id")
    private Long playerId; 

    @Column(name = "player_name", nullable = false, length = 100)
    private String playerName;

    @Column(name = "jersey_number", nullable = false)
    private Integer jerseyNumber;

    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Column(name = "total_matches", nullable = false)
    private Integer totalMatches;

    @Column(name = "team_name", nullable = false, length = 100)
    private String teamName;

    @Column(name = "state", nullable = false, length = 100)
    private String state;

    @Column(name = "description", length = 500)
    private String description;


    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(Integer totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", state=" + state
				+ ", description=" + description + "]";
	}

    
}
