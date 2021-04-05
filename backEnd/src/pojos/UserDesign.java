package pojos;

import javax.persistence.*;

@Entity
@Table(name="user_Designs")
public class UserDesign {
   private int designId,user,proc,motherBoard,ram,hdd,ssd,graphic,optical,smps,cabinet,cooler,
    monitor,keyboard,mouse,speaker,ups;

public UserDesign() {
}

public UserDesign( int user, int proc, int motherBoard, int ram, int hdd,int ssd, int graphic, int optical,
		int smps, int cabinet, int cooler, int monitor, int keyboard, int mouse, int speaker, int ups) {
	this.user = user;
	this.proc = proc;
	this.motherBoard = motherBoard;
	this.ram = ram;
	this.hdd = hdd;
	this.ssd = ssd;
	this.graphic = graphic;
	this.optical = optical;
	this.smps = smps;
	this.cabinet = cabinet;
	this.cooler = cooler;
	this.monitor = monitor;
	this.keyboard = keyboard;
	this.mouse = mouse;
	this.speaker = speaker;
	this.ups = ups;
}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getDesignId() {
	return designId;
}

public void setDesignId(int designId) {
	this.designId = designId;
}

public int getUser() {
	return user;
}

public void setUser(int user) {
	this.user = user;
}

public int getProc() {
	return proc;
}

public void setProc(int proc) {
	this.proc = proc;
}

public int getMotherBoard() {
	return motherBoard;
}

public void setMotherBoard(int motherBoard) {
	this.motherBoard = motherBoard;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

public int getHdd() {
	return hdd;
}

public void setHdd(int hdd) {
	this.hdd = hdd;
}


public int getSsd() {
	return ssd;
}

public void setSsd(int ssd) {
	this.ssd = ssd;
}

public int getGraphic() {
	return graphic;
}

public void setGraphic(int graphic) {
	this.graphic = graphic;
}

public int getOptical() {
	return optical;
}

public void setOptical(int optical) {
	this.optical = optical;
}

public int getSmps() {
	return smps;
}

public void setSmps(int smps) {
	this.smps = smps;
}

public int getCabinet() {
	return cabinet;
}

public void setCabinet(int cabinet) {
	this.cabinet = cabinet;
}

public int getCooler() {
	return cooler;
}

public void setCooler(int cooler) {
	this.cooler = cooler;
}

public int getMonitor() {
	return monitor;
}

public void setMonitor(int monitor) {
	this.monitor = monitor;
}

public int getKeyboard() {
	return keyboard;
}

public void setKeyboard(int keyboard) {
	this.keyboard = keyboard;
}

public int getMouse() {
	return mouse;
}

public void setMouse(int mouse) {
	this.mouse = mouse;
}

public int getSpeaker() {
	return speaker;
}

public void setSpeaker(int speaker) {
	this.speaker = speaker;
}

public int getUps() {
	return ups;
}

public void setUps(int ups) {
	this.ups = ups;
}



   
   

}
