package com.rpg.fried_shrimp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpg.fried_shrimp.dto.CreatePlayer;
import com.rpg.fried_shrimp.mapper.PlayerMapper;
import com.rpg.fried_shrimp.model.Player;
import com.rpg.fried_shrimp.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerMapper playerMapper; 
	
	@Override
	public Player getPlayerById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Player getPlayerByName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Player> getTopRanking() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Player savePlayer(CreatePlayer createPlayer) {
		
		return playerMapper.insertPlayer(createPlayer);
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
