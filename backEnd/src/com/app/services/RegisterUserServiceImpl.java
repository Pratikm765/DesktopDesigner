package com.app.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.daos.RegisterUserDao;

import pojos.Cabinet;
import pojos.Cpu_Cooler;
import pojos.Graphic_Card;
import pojos.Hdd;
import pojos.Keyboard;
import pojos.Monitor;
import pojos.Motherboard;
import pojos.Mouse;
import pojos.OpticalDrive;
import pojos.Processor;
import pojos.Ram;
import pojos.Smps;
import pojos.Speaker;
import pojos.Ssd;
import pojos.Technician;
import pojos.Ups;
import pojos.User;
import pojos.UserDesign;
@Service
@Transactional
public class RegisterUserServiceImpl implements RegisterUserService{
	@Autowired
	RegisterUserDao dao;



	@Override
	public String registerUser(User u) {
		return dao.registerUser(u);
	}

	@Override
	public User login(String email, String pass) {
		return dao.login(email, pass);
	}

	@Override
	public String registerTechnician(Technician t) {
		// TODO Auto-generated method stub
		return dao.registerTechcian(t);
	}

	@Override
	public String updatePass(User u) {
		return dao.updatePass(u);
	}

	@Override
	public List<Processor> getProcessorList() {
		// TODO Auto-generated method stub
		return dao.getProcessorList();
	}
	
	public List<Motherboard> getMotherboardList() {
		return dao.getMotherboardList();
	}
	public List<Ram> getRamList() {
		return dao.getRamList();
	}
	
	public List<Hdd> getHddList() {
		return dao.getHddList();
	}
	
	@Override
	public List<Ssd> getSsdList() {
		return dao.getSsdList();
	}

	public List<Cabinet> getCabinetList() {
		return dao.getCabinetList();
	}
	public List<Cpu_Cooler> getCpu_CoolerList() {
		return dao.getCpu_CoolerList();
	}
	public List<Monitor> getMonitorList() {
		return dao.getMonitorList();
	}
	public List<Mouse> getMouseList() {
		return dao.getMouseList();
	}
	public List<Ups> getUpsList() {
		return dao.getUpsList();
	}
	
	public List<Speaker> getSpeakerList() {
		return dao.getSpeakerList();
	}
	public List<Keyboard> getKeyboardList() {
		return dao.getKeyboardList();
	}
	public List<Graphic_Card> getGraphic_CardList() {
		return dao.getGraphic_CardList();
	}
	public List<Smps> getSmpsList() {
		return dao.getSmpsList();
	}
	public List<OpticalDrive> getOpticalDriveList() {
		return dao.getOpticalDriveList();
	}

	@Override
	public String savedesign(UserDesign t) {
		return dao.savedesign(t);
	}

	@Override
	public HashMap<String, Object> getDesignDetails(UserDesign t) {
		return dao.getDesignDetails(t);
	}
	
	
	}


