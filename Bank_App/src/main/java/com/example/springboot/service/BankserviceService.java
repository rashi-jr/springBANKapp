package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Bankservice;

import com.example.springboot.repository.BankserviceRepository;


@Service

public class BankserviceService {
	@Autowired
	private BankserviceRepository bankservicerepository;
	
	
	
	public List<Bankservice> getAllBankservices(){
		return bankservicerepository.findAll();
	}

}
