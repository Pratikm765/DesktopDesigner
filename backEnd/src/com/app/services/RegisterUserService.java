package com.app.services;


import pojos.Technician;
import pojos.Ups;
import pojos.User;
import pojos.UserDesign;

import java.util.HashMap;
import java.util.List;

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


public interface RegisterUserService {

	public String registerUser(User u);
	public String registerTechnician(Technician t);
	public User login(String email,String pass);
	public String updatePass(User u);
	public List<Processor> getProcessorList();
	public List<Motherboard> getMotherboardList();
	public List<Ram> getRamList();
	public List<Hdd> getHddList();
	public List<Ssd> getSsdList();
	public List<Cabinet> getCabinetList();
	public List<Cpu_Cooler> getCpu_CoolerList();
	public List<Monitor> getMonitorList();
	public List<Mouse> getMouseList();
	public List<Ups> getUpsList();
	public List<Speaker> getSpeakerList() ;
	public List<Keyboard> getKeyboardList() ;
	public List<Graphic_Card> getGraphic_CardList();
	public List<Smps> getSmpsList() ;
	public List<OpticalDrive> getOpticalDriveList();
	public String savedesign(UserDesign t);
	public HashMap<String, Object> getDesignDetails(UserDesign t);
}
