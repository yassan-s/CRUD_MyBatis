package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Saving;
import com.example.demo.mapper.SavingMapper;

@Service
public class SavingService {

	@Autowired
	SavingMapper savingMapper;

	/**
	* 一覧表示
	* @return List<Saving>
	*/
	public List<Saving> getSavingList(){
		return savingMapper.selectAll();
	}

	/**
	* 入出金データ１件の登録
	* @param saving
	*/
	public void insert(Saving saving) {
		savingMapper.insertSaving(saving);
	}

	/**
	* 1件のレコードを取得し,Form画面表示(更新処理用)
	* @param id
	*/
	public Saving getSaving(int id) {
		return savingMapper.getSaving(id);
	}

	/**
	* 入出金データ１件の更新
	* @param saving
	*/
	public void update(Saving saving) {
		savingMapper.updateSaving(saving);
	}

	/**
	* 収入の集計
	* 計算の条件 income_cost_flg == １
	* @param List<Saving> savings
	* @return totalIncome
	*/
	public int sumIncome(List<Saving> savings) {

		int totalIncome = 0;

		for (Saving saving : savings) {
			if (saving.getIncome_cost_flg() == 1) {
			totalIncome += saving.getMoney();
			}
		}
		return totalIncome;
	}

	/**
	* 支出の集計
	* 計算の条件 income_cost_flg == 0
	* @param List<Saving> savings
	* @return totalIncome
	*/
	public int sumCost(List<Saving> savings) {

		int totalCost = 0;

		for (Saving saving : savings) {
			if (saving.getIncome_cost_flg() == 0) {
				totalCost += saving.getMoney();
			}
		}
		return totalCost;
	}

}
