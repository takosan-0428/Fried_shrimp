package com.rpg.fried_shrimp.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.rpg.fried_shrimp.mapper.PlayerMapper;

public class CreatePlayer implements Serializable {

	@Autowired
	PlayerMapper playerMapper;

	int playerId;
	String playerName;
	int JobId;

	public void savePlayer() {
        playerMapper.insertPlayer(this);
        // insert文実行後、データベースから生成されたIDが playerId フィールドにセットされている
    }

    public int getPlayerId() {
        return playerId;
    }
}