package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

		model.addAttribute("test", "Home");

		//支出入を取得
		List<Saving> savings = service.getSavingList();

		//合計収入を計算
		int totalIncome = service.sumIncome(savings);
		//合計支出を計算
		int totalCost = service.sumCost(savings);

		model.addAttribute("savings", savings);
		model.addAttribute("totalIncome", totalIncome);
		model.addAttribute("totalCost", totalCost);
		model.addAttribute("totalMoney", totalIncome - totalCost);

		return "saving/list";
	}

	/**
	* Form画面表示
	* @param model
	* @param savingForm
	* @return html saving/form
	*/
	@GetMapping("/form")
	public String getForm(Model model, SavingForm savingForm) {

		model.addAttribute("title", "新規Form");

		// savingFormを新規登録のために、trueを格納
		savingForm.setNewSaving(true);

		return "saving/form";
	}

	/**
	* 入出金データ１件の登録
	* @param model
	* @param savingForm
	* @return redirect:/saving
	*/
	@PostMapping("/insert")
	public String insert(Model model, SavingForm savingForm) {

		Saving saving = makeSaving(savingForm);
		service.insert(saving);

		return "redirect:/saving";
	}

	/**
	* 1件のレコードを取得し,Form画面表示(更新処理用)
	* @param model
	* @param @PathVariable("id") int id
	* @return html saving/form
	*/
	@GetMapping("/edit/{id}")
	public String form(Model model, @PathVariable("id") int id) {

		Saving saving = service.getSaving(id);

		// 取得したデータを変換する
		SavingForm savingForm = makeSavingForm(saving);
		// savingFormを更新のために、falseを格納
		savingForm.setNewSaving(false);

		model.addAttribute("title", "更新form");
		model.addAttribute(savingForm);

		return "saving/form";
	}

	/**
	* 入出金データ１件の更新
	* @param model
	* @param savingForm
	* @return redirect:/saving
	*/
	@PostMapping("/update")
	public String update(Model model, SavingForm savingForm) {

		Saving saving = makeSaving(savingForm);
		service.update(saving);

		return "redirect:/saving";

	}

	/**
	* SavingForm(Form)からSaving(entity)に変換
	* @param savingForm
	* @return saving
	*/
	public Saving makeSaving(SavingForm savingForm) {

		Saving saving = new Saving();

		//今後ログインユーザーIDを取得予定
		//暫定で「user_id = １」を登録する
		saving.setId(savingForm.getId());
		saving.setUser_id(1);
		saving.setRecode_date(savingForm.getRecode_date());
		saving.setCategory_id(savingForm.getCategory_id());
		saving.setMoney(savingForm.getMoney());
		saving.setIncome_cost_flg(savingForm.getIncome_cost_flg());
		saving.setNote(savingForm.getNote());

		return saving;
	}

	/**
	* Saving(entity)からSavingForm(Form)に変換
	* @param saving
	* @return savingForm
	*/
	public SavingForm makeSavingForm(Saving saving) {

		SavingForm savingForm = new SavingForm();

		//今後ログインユーザーIDを取得予定
		//暫定で「user_id = １」を登録する
		savingForm.setId(saving.getId());
		savingForm.setUser_id(1);
		savingForm.setRecode_date(saving.getRecode_date());
		savingForm.setCategory_id(saving.getCategory_id());
		savingForm.setMoney(saving.getMoney());
		savingForm.setIncome_cost_flg(saving.getIncome_cost_flg());
		savingForm.setNote(saving.getNote());

		return savingForm;
	}

}
