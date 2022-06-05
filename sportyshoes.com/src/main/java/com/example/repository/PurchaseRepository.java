package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, String>{

	public Purchase findByDateAndShoecategory(String date,String category);
}
