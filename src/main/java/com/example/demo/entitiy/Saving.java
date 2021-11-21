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
	private int category_id;
	private int money;
	private int income_cost_flg;
	private String note;

	//コンストラクタ
	public Saving(int id, int user_id, LocalDateTime recode_date,
			int category_id, int money, int income_cost_flg, String note) {
		this.id = id;
		this.user_id = user_id;
		this.recode_date = recode_date;
		this.category_id = category_id;
		this.money = money;
		this.income_cost_flg = income_cost_flg;
		this.note = note;
	}

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
