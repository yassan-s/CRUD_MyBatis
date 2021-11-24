package com.example.demo.entitiy;

import java.time.LocalDateTime;

/**
* 貯金(Saving)項目と金額
*
*/
public class Saving {

	private int id;
	private int user_id;
	private LocalDateTime recode_date;
	private Category category;
	private int money;
	private int income_cost_flg;
	private String note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public LocalDateTime getRecode_date() {
		return recode_date;
	}

	public void setRecode_date(LocalDateTime recode_date) {
		this.recode_date = recode_date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
