package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entitiy.Saving;

@Mapper
public interface SavingMapper {

	public List<Saving> selectAll();

}
