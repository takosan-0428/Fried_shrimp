package com.rpg.fried_shrimp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Battle;
import com.example.demo.service.BattleService;
import com.example.demo.service.PlayerService;
import com.rpg.fried_shrimp.model.Player;

//@Controller
//@RequestMapping("/battle/result")
public interface BattleResultController {

	 private final BattleService battleService;
	 private final PlayerService playerService;
	 
	 Battle battle = battleService.getBattleById(battleId);
	 Player player = playerService.getPlayerById(battle.getPlayerId());
	 
	 	// @GetMapping("/battle/result/{battleId}")
	    public String showBattleResult(@PathVariable Long battleId, Model model);
	 
	
}
