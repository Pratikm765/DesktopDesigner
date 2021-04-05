package pojos;

import javax.persistence.*;

@Entity
@Table(name="mouse")
public class Mouse {
	private int product_Id;
	private String mouse_Model,brand,intface,cost_Primeabgb,cost_Amazon,cost_Mdcomputers;
	private int price;
	public Mouse() {
		// TODO Auto-generated constructor stub
	}
	public Mouse(int product_Id, String mouse_Model, String brand, String intface, String cost_Primeabgb,
			String cost_Amazon, String cost_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.mouse_Model=mouse_Model;
		this.brand = brand;
		this.intface = intface;
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
	
	@Column(name="mouse_Model")
	public String getMouse_Model() {
		return mouse_Model;
	}
	public void setMouse_Model(String mouse_Model) {
		this.mouse_Model = mouse_Model;
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
