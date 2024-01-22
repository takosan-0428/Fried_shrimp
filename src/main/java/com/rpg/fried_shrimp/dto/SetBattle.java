package com.rpg.fried_shrimp.dto;

import java.util.Random;

public class SetBattle {

	int battleId;
	int playerId;
	int enemyId;
	private final CreatePlayer createPlayer;

	 public SetBattle(CreatePlayer createPlayer) {
	        this.createPlayer = createPlayer;
	    }

	    public int insert(SetBattle setbattle) {
	        playerId = createPlayer.getPlayerId();
	        return enemyId = new Random().nextInt(10) + 1;
	    }

}