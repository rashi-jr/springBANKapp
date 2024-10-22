package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.model.Bankbranch;
import com.example.springboot.model.Bankservice;
import com.example.springboot.service.BankbranchService;
import com.example.springboot.service.BankserviceService;




@Controller

public class BankbranchController {
	@Autowired
	private BankbranchService bankService;
	

	@GetMapping("/branches")
	public ModelAndView getAllBankbranches() {
		List <Bankbranch> list = bankService.getAllBankbranches();
		return new ModelAndView("branches","Bankbranch",list);
	}
	
	@Autowired
    private BankserviceService bankserviceService;

    @GetMapping("/service")
    public ModelAndView getAllBankservices() {
        List<Bankservice> services = bankserviceService.getAllBankservices();
        return new ModelAndView("service", "Bankservice", services);
    }
	 
}