package com.rpg.fried_shrimp.model;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class Battle {

    
    private int battleId;
    private int playerId;
    private int enemyId;
    private int turn;
    private int points;
    private Timestamp createDate;
    private BattleResult battleResult;

    public enum BattleResult{
    	WIN,LOSE
    }
    public Battle findById(Long id) {
        // TODO: データベースからIDに基づいてBattleを検索する実装
        return null;
    }

    
    public void save(Battle battle) {
        // TODO: データベースにBattleを保存する実装
    }

    // 以下、GetterとSetterメソッド

    
    public Timestamp createDate() {
        return createDate;
    }

    
    public int battleId() {
        return battleId;
    }

    
    public int playerId() {
        return playerId;
    }

    
    public int enemyId() {
        return enemyId;
    }

    
    public int turn() {
        return turn;
    }


    
    public BattleResult battleResult() {
        return battleResult;
    }

    
    public void setBattleResult(BattleResult battleResult) {
        this.battleResult = battleResult;
    }

	
	public int point() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}
