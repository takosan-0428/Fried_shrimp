package com.rpg.fried_shrimp.service;

import java.util.List;

import com.rpg.fried_shrimp.dto.CreatePlayer;
import com.rpg.fried_shrimp.model.Player;

public interface PlayerService {
    Player getPlayerById(int id);
    Player getPlayerByName(String name);
    List<Player> getTopRanking();
    Player savePlayer(CreatePlayer createPlayer);
    
    
    // その他プレイヤー関連のロジックを追加
}
