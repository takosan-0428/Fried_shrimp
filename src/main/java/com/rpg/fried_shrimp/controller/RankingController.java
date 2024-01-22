package com.rpg.fried_shrimp.controller;

import org.springframework.ui.Model;

import com.example.demo.service.BattleService;

//@Controller
public interface RankingController {

	private final BattleService battleService;
	
	// @GetMapping("/ranking")
    public String showRanking(Model model);
        // ランキング表示に必要な処理を実装
}
