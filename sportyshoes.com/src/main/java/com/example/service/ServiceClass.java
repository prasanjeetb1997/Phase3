package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.entity.Purchase;
import com.example.entity.User;
import com.example.repository.ProductRepository;
import com.example.repository.PurchaseRepository;
import com.example.repository.UserRepository;

@Service
public class ServiceClass {


	@Autowired
	ProductRepository productrepo;
	@Autowired
	UserRepository userrepo;
	@Autowired
	PurchaseRepository purchaserepo;
	
	
	public void saveproduct(Product product) {
		productrepo.save(product);
	}
	
	public List<User> getUsers(){
		return userrepo.findAll();
	
	}
	
	public User getUser(int userid) {
		Optional<User> user= userrepo.findById(userid);
		return user.get();
	}
	
	public Purchase getPurchasereport(String date,String category) {
		return purchaserepo.findByDateAndShoecategory(date, category);
	}
	
}


