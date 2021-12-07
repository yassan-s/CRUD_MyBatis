package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Saving;

@Mapper
public interface SavingMapper {

	// 全件取得
	public List<Saving> selectAll();

	// 1件登録
	public void insertSaving(Saving saving);

	// 1件取得
	public Saving getSaving(int id);

	// 1件更新
	public void updateSaving(Saving saving);

	// 1件削除
	public void deleteSaving(int id);

}
