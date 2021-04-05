package pojos;

import javax.persistence.*;

@Entity
@Table(name="speaker")
public class Speaker {
	private int product_Id;
	private String speaker_Model,brand,configuration,cost_Primeabgb,cost_Amazon,cost_Mdcomputers;
	private int price;
	public Speaker() {
		// TODO Auto-generated constructor stub
	}
	public Speaker(int product_Id, String speaker_Model, String brand, String configuration, String cost_Primeabgb,
			String cost_Amazon, String cost_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.speaker_Model = speaker_Model;
		this.brand = brand;
		this.configuration = configuration;
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
	@Column(name="speaker_Model")
	public String getSpeaker_Model() {
		return speaker_Model;
	}
	public void setSpeaker_Model(String speaker_Model) {
		this.speaker_Model = speaker_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="configuration")
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
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
