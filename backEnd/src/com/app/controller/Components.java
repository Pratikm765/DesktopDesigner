package com.app.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.app.services.RegisterUserService;

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
import pojos.Technician;
import pojos.Ups;
import pojos.User;
import pojos.UserDesign;

@CrossOrigin("http://localhost:4200")
@EnableWebMvc
@RestController
@RequestMapping("/component")
public class Components {
	@Autowired
	RegisterUserService service;
	
	@RequestMapping(value="/processor")
	public ResponseEntity< List<Processor> > getProcessorList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Processor>>(service.getProcessorList(),head,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/motherboard")
	public ResponseEntity< List<Motherboard> > getMotherboardList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Motherboard>>(service.getMotherboardList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/ram")
	public ResponseEntity< List<Ram> > getRAMList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Ram>>(service.getRamList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/hdd")
	public ResponseEntity< List<Hdd> > getHddList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Hdd>>(service.getHddList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/ssd")
	public ResponseEntity< List<Hdd> > getSsdList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Hdd>>(service.getHddList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/cabinet")
	public ResponseEntity< List<Cabinet> > getCabinetList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Cabinet>>(service.getCabinetList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/cooler")
	public ResponseEntity< List<Cpu_Cooler> > getCpu_CoolerList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Cpu_Cooler>>(service.getCpu_CoolerList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/monitor")
	public ResponseEntity< List<Monitor> > getMonitorList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Monitor>>(service.getMonitorList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/mouse")
	public ResponseEntity< List<Mouse> > getMouseList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Mouse>>(service.getMouseList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/ups")
	public ResponseEntity< List<Ups> > getUPSList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Ups>>(service.getUpsList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/speaker")
	public ResponseEntity< List<Speaker> > getSpeakerList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Speaker>>(service.getSpeakerList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/keyboard")
	public ResponseEntity< List<Keyboard> > getKeyboardList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Keyboard>>(service.getKeyboardList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/graphiccard")
	public ResponseEntity< List<Graphic_Card> > getGraphic_CardList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Graphic_Card>>(service.getGraphic_CardList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/smps")
	public ResponseEntity< List<Smps> > getSmpsList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<Smps>>(service.getSmpsList(),head,HttpStatus.CREATED);
	}
	@RequestMapping(value="/opticaldrive")
	public ResponseEntity< List<OpticalDrive> > getOpticalDriveList()
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<List<OpticalDrive>>(service.getOpticalDriveList(),head,HttpStatus.CREATED);
	}

	@PostMapping(value="/userDesign")
	public ResponseEntity<Void> userDesigns(@RequestBody UserDesign t)
	{
		System.out.println("ready");
		service.savedesign(t);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value="/getDesign")
	public ResponseEntity< HashMap<String, Object>> getDesignDetail(@RequestBody UserDesign t)
	{
		HttpHeaders head=new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity< HashMap<String, Object>>(service.getDesignDetails(t),head,HttpStatus.OK);
	}
	
	








}
