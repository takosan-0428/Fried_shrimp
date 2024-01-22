package com.rpg.fried_shrimp.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.rpg.fried_shrimp.mapper.BattleMapper;

public class BattleAchie {
	@Autowired
	BattleMapper battleMapper;
	
	private final CreatePlayer createPlayer;
	int turns;
	int points;
	
	public BattleAchie(CreatePlayer createPlayer) {
		this.createPlayer = createPlayer;
	}
	public void setTurns() {
		this.points = battleMapper.getPoint(createPlayer.playerId);
	}
	public int getTurns() {
		return createPlayer.turns;
	}

}
