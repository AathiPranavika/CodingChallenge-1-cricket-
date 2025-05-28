package com.hexaware.cricketteam.dto;

import jakarta.validation.constraints.*;

public class PlayerDTO {

    @NotNull(message = "Player ID cannot be null")
    private Long playerId;

    @NotBlank(message = "Player name is mandatory")
    @Size(min = 2, max = 255, message = "Player name must be between 2 and 255 characters")
    private String playerName;

    @NotNull(message = "Jersey number is mandatory")
    @Min(value = 0, message = "Jersey number must be a positive number")
    private Integer jerseyNumber;

    @NotBlank(message = "Role is mandatory")
    @Pattern(
        regexp = "Batsman|Bowler|Keeper|All Rounder",
        message = "Role must be one of: Batsman, Bowler, Keeper, All Rounder"
    )
    private String role;

    @NotNull(message = "Total matches cannot be null")
    @Min(value = 0, message = "Total matches must be 0 or more")
    private Integer totalMatches;

    @NotBlank(message = "Team name is mandatory")
    private String teamName;

    @NotBlank(message = "State/Country name is mandatory")
    private String state;

    @Size(max = 1000, message = "Description must not exceed 1000 characters")
    private String description;

    public PlayerDTO() {}

    public PlayerDTO(Long playerId, String playerName, Integer jerseyNumber, String role,
                     Integer totalMatches, String teamName, String state, String description) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
        this.totalMatches = totalMatches;
        this.teamName = teamName;
        this.state = state;
        this.description = description;
    }

    // Getters and Setters
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
}
