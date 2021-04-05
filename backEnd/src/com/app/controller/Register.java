package com.app.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.app.services.RegisterUserService;

import models.UserModel;
import pojos.Technician;
import pojos.User;

@CrossOrigin("http://localhost:4200")
@EnableWebMvc
@RestController
@RequestMapping("/user")
public class Register {
	@Autowired
	RegisterUserService service;
public Register() {
	System.out.println("in constr"+getClass().getName());
}
	@PostMapping(value="/register")
	public ResponseEntity<Void> registerUser(@RequestBody User u)
	{
		System.out.println("ready");
		service.registerUser(u);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value="/registerTech")
	public ResponseEntity<Void> registerTech(@RequestBody Technician t)
	{
		System.out.println("ready");
		service.registerTechnician(t);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@PostMapping(value="/login")
	public ResponseEntity<User> login(@RequestBody User u,HttpSession hs)
	{
		User user=service.login(u.getEmail(),u.getPassword());
		hs.setAttribute("valid user", user);
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		System.out.println(user.getFname()+user.getLname());
		return new ResponseEntity<User>(user,head,HttpStatus.OK);
	}
	@PostMapping(value="/updatepass")
	public ResponseEntity<User> updatePass(@RequestBody User u)
	{
		
		service.updatePass(u);;
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	
	
}
