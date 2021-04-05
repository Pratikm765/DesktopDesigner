package pojos;

import javax.persistence.*;

@Entity
@Table(name="keyboard")
public class Keyboard {
	private int product_Id;
	private String keyboard_Model,brand,intface,mouse_inc,cost_Primeabgb,cost_Amazon,cost_Mdcomputers;
	private int price;
	public Keyboard() {
		// TODO Auto-generated constructor stub
	}
	public Keyboard(int product_Id, String keyboard_Model, String brand, String intface, String mouse_inc,
			String cost_Primeabgb, String cost_Amazon, String cost_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.keyboard_Model = keyboard_Model;
		this.brand = brand;
		this.intface = intface;
		this.mouse_inc = mouse_inc;
		this.cost_Primeabgb = cost_Primeabgb;
		this.cost_Amazon = cost_Amazon;
		this.cost_Mdcomputers = cost_Mdcomputers;
		this.price = price;
	}
	@Id
	@Column(name="product_Id")
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	@Column(name="keyboard_Model")
	public String getKeyboard_Model() {
		return keyboard_Model;
	}
	public void setKeyboard_Model(String keyboard_Model) {
		this.keyboard_Model = keyboard_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="interface")
	public String getIntface() {
		return intface;
	}
	public void setIntface(String intface) {
		this.intface = intface;
	}
	@Column(name="mouse_Inc")
	public String getMouse_inc() {
		return mouse_inc;
	}
	public void setMouse_inc(String mouse_inc) {
		this.mouse_inc = mouse_inc;
	}
	@Column(name="cost_Primeabgb")
	public String getCost_Primeabgb() {
		return cost_Primeabgb;
	}
	public void setCost_Primeabgb(String cost_Primeabgb) {
		this.cost_Primeabgb = cost_Primeabgb;
	}
	@Column(name="cost_Amazon")
	public String getCost_Amazon() {
		return cost_Amazon;
	}
	public void setCost_Amazon(String cost_Amazon) {
		this.cost_Amazon = cost_Amazon;
	}
	@Column(name="cost_Mdcomputers")
	public String getCost_Mdcomputers() {
		return cost_Mdcomputers;
	}
	public void setCost_Mdcomputers(String cost_Mdcomputers) {
		this.cost_Mdcomputers = cost_Mdcomputers;
	}
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
