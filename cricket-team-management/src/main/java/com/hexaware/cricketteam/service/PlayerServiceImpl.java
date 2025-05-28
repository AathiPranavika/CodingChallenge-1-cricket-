package com.hexaware.cricketteam.service;

import com.hexaware.cricketteam.dto.PlayerListDTO;
import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.exceptions.PlayerNotFoundException;
import com.hexaware.cricketteam.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements IPlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Long playerId) {
        Optional<Player> player = playerRepository.findById(playerId);
        if(player.isEmpty())
        {
        	throw new PlayerNotFoundException("Player not found");
        }
        return player.get();
    }

    @Override
    public List<Player> getAllPlayers() {
        List<Player> players = playerRepository.findAll();
        if (players.isEmpty()) {
            throw new PlayerNotFoundException("No players found");
        }
        return players;
    }

    @Override
    public Player updatePlayer(Long playerId, Player updatedPlayer) {
        Player player = getPlayerById(playerId);

        player.setPlayerName(updatedPlayer.getPlayerName());
        player.setJerseyNumber(updatedPlayer.getJerseyNumber());
        player.setRole(updatedPlayer.getRole());
        player.setTotalMatches(updatedPlayer.getTotalMatches());
        player.setTeamName(updatedPlayer.getTeamName());
        player.setState(updatedPlayer.getState());
        player.setDescription(updatedPlayer.getDescription());

        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long playerId) {
        Player existingPlayer = getPlayerById(playerId);
        playerRepository.delete(existingPlayer);
    }

    @Override
    public List<PlayerListDTO> getAllPlayerList() {
        List<Player> players = playerRepository.findAll();
        if (players.isEmpty()) {
            throw new PlayerNotFoundException("No players found");
        }
        List<PlayerListDTO> listDTO = new ArrayList<>();
        for (Player p : players) {
            listDTO.add(new PlayerListDTO(
                p.getPlayerId(),
                p.getPlayerName(),
                p.getJerseyNumber(),
                p.getRole()
            ));
        }
        return listDTO;
    }
   
}
