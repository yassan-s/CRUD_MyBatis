package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitiy.Saving;
import com.example.demo.mapper.SavingMapper;

@Service
public class SavingService {

	@Autowired
	SavingMapper savingMapper;

	public List<Saving> getSavingList(){
		return savingMapper.selectAll();
	}

}
