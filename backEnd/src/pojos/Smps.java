package pojos;

import javax.persistence.*;

@Entity
@Table(name="smps")
public class Smps {
	private int product_Id;
	private String smps_Model,brand,power,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Smps() {
		// TODO Auto-generated constructor stub
	}
	public Smps(int product_Id, String smps_Model, String brand, String power, String link_Primeabgb,
			String link_Amazon, String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.smps_Model = smps_Model;
		this.brand = brand;
		this.power = power;
		this.link_Primeabgb = link_Primeabgb;
		this.link_Amazon = link_Amazon;
		this.link_Mdcomputers = link_Mdcomputers;
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
	@Column(name="smps_Model")
	public String getSmps_Model() {
		return smps_Model;
	}
	public void setSmps_Model(String smps_Model) {
		this.smps_Model = smps_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="power")
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Column(name="link_Primeabgb")
	public String getLink_Primeabgb() {
		return link_Primeabgb;
	}
	public void setLink_Primeabgb(String link_Primeabgb) {
		this.link_Primeabgb = link_Primeabgb;
	}
	@Column(name="link_Amazon")
	public String getLink_Amazon() {
		return link_Amazon;
	}
	public void setLink_Amazon(String link_Amazon) {
		this.link_Amazon = link_Amazon;
	}
	@Column(name="link_Mdcomputers")
	public String getLink_Mdcomputers() {
		return link_Mdcomputers;
	}
	public void setLink_Mdcomputers(String link_Mdcomputers) {
		this.link_Mdcomputers = link_Mdcomputers;
	}
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
		
	
	
	
	
	
	
}
