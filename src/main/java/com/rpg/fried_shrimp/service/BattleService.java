package com.rpg.fried_shrimp.service;



import com.rpg.fried_shrimp.dto.SetBattle;
import com.rpg.fried_shrimp.model.Battle;
import com.rpg.fried_shrimp.model.Battle.BattleResult;
import com.rpg.fried_shrimp.model.Player;

public interface BattleService {
    Battle getBattleById(int id);
    void saveBattle(Battle battle);
    Battle setBattle(SetBattle setbattle);
    // その他バトル関連のロジックを追加
    
    BattleResult startBattle(Player player, int enemyId); // 適切な引数や戻り値を設定
}
