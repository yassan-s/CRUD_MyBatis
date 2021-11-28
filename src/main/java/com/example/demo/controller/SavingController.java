package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Saving;
import com.example.demo.form.SavingForm;
import com.example.demo.service.SavingService;

/**
* 貯金の一覧画面を制御する
*
*/
@Controller
@RequestMapping("/saving")
public class SavingController {

	@Autowired
	SavingService service;

	/**
	* 一覧表示
	* @param model
	* @return html saving/list
	*/
	@GetMapping
	public String list(Model model) {

		model.addAttribute("test", "貯金");

		List<Saving> savings = service.getSavingList();
		model.addAttribute("savings", savings);

		return "saving/list";
	}

	/**
	* Form画面表示
	* @param model
	* @param taskForm
	* @return html saving/form
	*/
	@GetMapping("/form")
	public String form(Model model, SavingForm savingForm) {

		model.addAttribute("title", "form");

		return "saving/form";
	}

	/**
	* 入出金データ１件の登録
	* @param model
	* @param taskForm
	* @return redirect:/saving
	*/
	@PostMapping("/insert")
	public String insert(Model model, SavingForm savingForm) {

		Saving saving = makeSaving(savingForm);
		service.insert(saving);

		return "redirect:/saving";
	}

	/**
	* SavingForm(Form)からSaving(entity)への入れ直す
	* @param savingForm
	* @return saving
	*/
	public Saving makeSaving(SavingForm savingForm) {

		Saving saving = new Saving();

		//今後ログインユーザーIDを取得予定
		//暫定で「user_id = １」を登録する
		saving.setUser_id(1);
		saving.setRecode_date(savingForm.getRecode_date());
		saving.setCategory_id(savingForm.getCategory_id());
		saving.setMoney(savingForm.getMoney());
		saving.setIncome_cost_flg(savingForm.getIncome_cost_flg());
		saving.setNote(savingForm.getNote());

		return saving;
	}

}
