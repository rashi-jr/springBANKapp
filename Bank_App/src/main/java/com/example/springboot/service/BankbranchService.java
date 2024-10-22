package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Bankbranch;
import com.example.springboot.repository.BankbranchRepository;

@Service

public class BankbranchService {
	
	@Autowired
	private BankbranchRepository bankbranchrepository;
	
	
	
	public List<Bankbranch> getAllBankbranches(){
		return bankbranchrepository.findAll();
	}
	
	 

}
