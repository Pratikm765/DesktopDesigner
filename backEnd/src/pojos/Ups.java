package pojos;

import javax.persistence.*;

@Entity
@Table(name="UPS")
public class Ups {
	private int product_Id;
	private String ups_Model,brand,power,cost_Primeabgb,cost_Amazon,cost_Mdcomputers;
	private int price;
	public Ups() {
		// TODO Auto-generated constructor stub
	}
	public Ups(int product_Id, String ups_Model, String brand,String power, String cost_Primeabgb, String cost_Amazon,
			String cost_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.ups_Model = ups_Model;
		this.brand = brand;
		this.cost_Primeabgb = cost_Primeabgb;
		this.cost_Amazon = cost_Amazon;
		this.cost_Mdcomputers = cost_Mdcomputers;
		this.price = price;
		this.power=power;
	}
	@Id
	@Column(name="product_Id")
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	
	@Column(name="ups_Model")
	public String getUps_Model() {
		return ups_Model;
	}
	public void setUps_Model(String ups_Model) {
		this.ups_Model = ups_Model;
	}
	@Column(name="power")
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
