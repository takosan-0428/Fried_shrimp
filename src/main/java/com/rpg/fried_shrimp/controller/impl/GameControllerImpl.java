package com.rpg.fried_shrimp.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rpg.fried_shrimp.controller.GameController;
import com.rpg.fried_shrimp.mapper.JobMapper;
import com.rpg.fried_shrimp.model.Job;
import com.rpg.fried_shrimp.model.PlayerSkill;
import com.rpg.fried_shrimp.service.SkillService;

@Controller
@RequestMapping(value = "/")
public class GameControllerImpl implements GameController {

	@Autowired
	private JobMapper jobMapper;
	@Autowired
	private SkillService skillService;

	@GetMapping("/")
    public String index(Model model) {
        
		List<Job> jobs = jobMapper.getAllJob();
		
        model.addAttribute("jobs", jobs);
        return "index";
	}

	@GetMapping(value = "{playerId}")
	public String waiting(@PathVariable int playerId, Model model) {
		// playerId を使ってプレイヤーが所持しているスキルを取得する処理
		List<PlayerSkill> playerSkills = skillService.getPlayerSkills(playerId); // 仮定のメソッド

		// モデルに必要なデータを追加
		model.addAttribute("playerId", playerId);
		model.addAttribute("playerSkills", playerSkills);

		return "waiting";
	}

	@Override
	public String showRanking(Model model) {
		// TODO 自動生成されたメソッド・スタブ

		return "ranking";
	}

	@Override
	public String gameClear(Model model) {
		// TODO 自動生成されたメソッド・スタブ
		return "clear";
	}

	@Override
	@GetMapping("/give-up")
	public String giveUpGame() {
		// ゲームを放棄する処理
		return "redirect:/";
	}

	@Override
	public String battle(Model model) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
