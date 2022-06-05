package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.entity.Product;
import com.example.entity.Purchase;
import com.example.entity.User;
import com.example.service.ServiceClass;

@Controller
public class ControllerClass {

	@Autowired
	ServiceClass service;
	
	@RequestMapping("sportyshoes")
	public String adminPage() {
		return "admindashboard";
	}
	
	
	@RequestMapping("productpage")
	public String product() {
		return"productoperation";
	}
	
	
	@ResponseBody
	@RequestMapping(value= "updateproduct")
	public String saveProduct(@ModelAttribute Product product) {
		service.saveproduct(product);
	return "Successfully Saved";
	}
	
	
	@RequestMapping("useroperation")
	public String userOperation() {
		return"useroperation";
	}
	
	
    @ResponseBody
	@RequestMapping("getalluser")
	public List<User> getUsers(){
		return service.getUsers();
		}
    
    
    @ResponseBody
    @RequestMapping("getuser")
    public User getUser(@RequestParam("userid") String userid) {
		return service.getUser(Integer.parseInt(userid));
    	}
    
    
    @RequestMapping("purchaseoperation")
    public String purchasePage() {
    	return "purchasepage";
    }
    
    
    @ResponseBody
    @RequestMapping("getpurchasereport")
    public Purchase getPurchaseReport(@RequestParam("Date") String date,@RequestParam("ShoeCategory") String category) {
		return service.getPurchasereport(date, category);
    }
}


