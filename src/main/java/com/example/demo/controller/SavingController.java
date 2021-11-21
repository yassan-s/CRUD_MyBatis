package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entitiy.Saving;
import com.example.demo.service.SavingService;

/**
* 貯金の一覧画面を制御する
*
*
*/
@Controller
@RequestMapping("/saving")
public class SavingController {

	@Autowired
	SavingService service;

	@GetMapping
	public String list(Model model) {

		model.addAttribute("test", "貯金");

		List<Saving> savings = service.getSavingList();
		model.addAttribute("savings", savings);

		return "saving/list";
	}

}
