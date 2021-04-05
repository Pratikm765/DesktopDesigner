package com.app.daos;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.Cookie;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository
public class RegisterUserDaoImpl implements RegisterUserDao{
	@Autowired
	SessionFactory sf;

	@Override
	public String registerUser(User u) {
		
		return "User registered successfully "+sf.getCurrentSession().save(u);
	}
	@Override
	public User login(String email, String pass) {
		try {
			String jpql="select u from User u where u.email=:em and u.password=:pw";
			return sf.getCurrentSession().createQuery(jpql, User.class).setParameter("em",email).setParameter("pw", pass).getSingleResult();
		}
		catch(Exception e)
		{
			return new User();
		}
	}
	@Override
	public String registerTechcian(Technician t) {
		return "Technician registered successfully "+sf.getCurrentSession().save(t);
	}
	@Override
	public String updatePass(User u) {
		sf.getCurrentSession().update(u);
		return "Updated Succefully";
	}
	@Override
	public List<Processor> getProcessorList() {
		String jpql="select p from Processor p";
		return sf.getCurrentSession().createQuery(jpql, Processor.class).getResultList();
	}
	public List<Motherboard> getMotherboardList() {
		String jpql="select m from Motherboard m";
		return sf.getCurrentSession().createQuery(jpql, Motherboard.class).getResultList();
	}
	public List<Ram> getRamList() {
		String jpql="select r from Ram r";
		return sf.getCurrentSession().createQuery(jpql, Ram.class).getResultList();
	}
	public List<Hdd> getHddList() {
		String jpql="select h from Hdd h";
		return sf.getCurrentSession().createQuery(jpql, Hdd.class).getResultList();
	}
	@Override
	public List<Ssd> getSsdList() {
		String jpql="select h from Ssd h";
		return sf.getCurrentSession().createQuery(jpql, Ssd.class).getResultList();
	}
	public List<Cabinet> getCabinetList() {
		String jpql="select c from Cabinet c";
		return sf.getCurrentSession().createQuery(jpql, Cabinet.class).getResultList();
	}
	public List<Cpu_Cooler> getCpu_CoolerList() {
		String jpql="select cp from Cpu_Cooler cp";
		return sf.getCurrentSession().createQuery(jpql, Cpu_Cooler.class).getResultList();
	}
	public List<Monitor> getMonitorList() {
		String jpql="select mo from Monitor mo";
		return sf.getCurrentSession().createQuery(jpql, Monitor.class).getResultList();
	}
	public List<Mouse> getMouseList() {
		String jpql="select m from Mouse m";
		return sf.getCurrentSession().createQuery(jpql, Mouse.class).getResultList();
	}
	public List<Ups> getUpsList() {
		String jpql="select u from Ups u";
		return sf.getCurrentSession().createQuery(jpql, Ups.class).getResultList();
	}
	public List<Speaker> getSpeakerList() {
		String jpql="select s from Speaker s";
		return sf.getCurrentSession().createQuery(jpql, Speaker.class).getResultList();
	}
	public List<Keyboard> getKeyboardList() {
		String jpql="select k from Keyboard k";
		return sf.getCurrentSession().createQuery(jpql, Keyboard.class).getResultList();
	}
	public List<Graphic_Card> getGraphic_CardList() {
		String jpql="select g from Graphic_Card g";
		return sf.getCurrentSession().createQuery(jpql, Graphic_Card.class).getResultList();
	}
	public List<Smps> getSmpsList() {
		String jpql="select s from Smps s";
		return sf.getCurrentSession().createQuery(jpql, Smps.class).getResultList();
	}
	public List<OpticalDrive> getOpticalDriveList() {
		String jpql="select o from OpticalDrive o";
		return sf.getCurrentSession().createQuery(jpql, OpticalDrive.class).getResultList();
	}
	@Override
	public String savedesign(UserDesign t) {
		return "Design Saved successfully"+sf.getCurrentSession().save(t);
	}
	@Override
	public HashMap<String, Object> getDesignDetails(UserDesign t) {
		HashMap<String, Object> designDetail=new HashMap<>();
		designDetail.put("processor", sf.getCurrentSession().get(Processor.class, t.getProc()));
		designDetail.put("motherboard", sf.getCurrentSession().get(Motherboard.class, t.getMotherBoard()));
		designDetail.put("ram", sf.getCurrentSession().get(Ram.class, t.getRam()));
		designDetail.put("hdd", sf.getCurrentSession().get(Hdd.class, t.getHdd()));
		designDetail.put("ssd", sf.getCurrentSession().get(Ssd.class, t.getSsd()));
		designDetail.put("graphic", sf.getCurrentSession().get(Graphic_Card.class, t.getGraphic()));
		designDetail.put("cabinet", sf.getCurrentSession().get(Cabinet.class, t.getCabinet()));
		designDetail.put("cooler", sf.getCurrentSession().get(Cpu_Cooler.class, t.getCooler()));
		designDetail.put("smps", sf.getCurrentSession().get(Smps.class, t.getSmps()));
		designDetail.put("optical", sf.getCurrentSession().get(OpticalDrive.class, t.getOptical()));
		designDetail.put("monitor", sf.getCurrentSession().get(Monitor.class, t.getMonitor()));
		designDetail.put("keyboard", sf.getCurrentSession().get(Keyboard.class, t.getKeyboard()));
		designDetail.put("mouse", sf.getCurrentSession().get(Mouse.class, t.getMouse()));
		designDetail.put("speaker", sf.getCurrentSession().get(Speaker.class, t.getSpeaker()));
		designDetail.put("ups", sf.getCurrentSession().get(Ups.class, t.getUps()));
		
		
		return designDetail;
	}
	
	}

