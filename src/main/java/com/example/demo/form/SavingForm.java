package com.example.demo.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

/**
* Formの入力値を格納
*/
public class SavingForm {

	private int user_id;

	// form画面から取得した値をformat変換する
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate recode_date;

	private int category_id;

	private int money;

	private int income_cost_flg;

	private String note;

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public LocalDate getRecode_date() {
		return recode_date;
	}
	public void setRecode_date(LocalDate recode_date) {
		this.recode_date = recode_date;
	}

	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public int getIncome_cost_flg() {
		return income_cost_flg;
	}
	public void setIncome_cost_flg(int income_cost_flg) {
		this.income_cost_flg = income_cost_flg;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
