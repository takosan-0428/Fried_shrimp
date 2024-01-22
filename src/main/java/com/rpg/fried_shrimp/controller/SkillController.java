package com.rpg.fried_shrimp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.service.PlayerService;

//@Controller
public interface SkillController {
	
	private final PlayerService playerService;

    // @GetMapping("/skills/{playerId}")
    public String showPlayerSkills(@PathVariable Long playerId, Model model);
}

