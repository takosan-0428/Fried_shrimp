package com.rpg.fried_shrimp.controller.impl;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rpg.fried_shrimp.controller.PlayerController;
import com.rpg.fried_shrimp.dto.CreatePlayer;
import com.rpg.fried_shrimp.model.Player;
import com.rpg.fried_shrimp.service.impl.PlayerServiceImpl;

@Controller
public class PlayerControllerImpl implements PlayerController {

	private PlayerServiceImpl playerService;

	@PostMapping(value = "/creat/player")
	public String creatPlayer(@ModelAttribute CreatePlayer createPlayer, Model model) {
		// playerの処理（例：データベースに保存など）
		Player player = playerService.savePlayer(createPlayer);

		// Modelにデータを追加
		int generatedPlayerId = player.getPlayerId();
		// ビューにリダイレクト
		String dynamicUrl = "" + generatedPlayerId;
		
		model.addAttribute("player", player);
		return "redirect:/waiting";
	}

	@Override
	public String getAllPlayers(Model model) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String skillManagement(Model model) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getSkills(List<Long> selectedSkillIds) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
