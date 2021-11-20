package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 貯金の一覧画面を制御する
*
*
*/
@Controller
@RequestMapping("/saving")
public class SavingController {

	@GetMapping
	public String list(Model model) {

		model.addAttribute("test", "貯金");

		return "saving/list";
	}

}
