package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.springboot.model.Bankservice;


@Repository
public interface BankserviceRepository extends JpaRepository<Bankservice, Long>{
	
}


