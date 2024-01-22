package com.rpg.fried_shrimp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rpg.fried_shrimp.dto.CreatePlayer;
import com.rpg.fried_shrimp.model.Player;

@Mapper
public interface PlayerMapper {

	Player getPlayerById(int id);

	List<Player> getAllPlayers();

	Player insertPlayer(CreatePlayer createPlayer);

}
