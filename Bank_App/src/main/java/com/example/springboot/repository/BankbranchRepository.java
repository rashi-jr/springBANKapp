package com.example.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.springboot.model.Bankbranch;


@Repository
public interface BankbranchRepository extends JpaRepository<Bankbranch, Long>{

}
