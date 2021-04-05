package pojos;

import javax.persistence.*;

@Entity
@Table(name="motherboard")
public class Motherboard {
	private int product_Id;
	private String mobd_Model,brand,platform,memory_Type,socket_Type,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Motherboard() {
		// TODO Auto-generated constructor stub
	}
	public Motherboard(int product_Id, String mobd_Model, String brand, String platform, String memory_Type,
			String socket_Type, String link_Primeabgb, String link_Amazon, String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.mobd_Model = mobd_Model;
		this.brand = brand;
		this.platform = platform;
		this.memory_Type = memory_Type;
		this.socket_Type = socket_Type;
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
	@Column(name="mobd_Model")
	public String getMobd_Model() {
		return mobd_Model;
	}
	public void setMobd_Model(String mobd_Model) {
		this.mobd_Model = mobd_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="platform")
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	@Column(name="memory_Type")
	public String getMemory_Type() {
		return memory_Type;
	}
	public void setMemory_Type(String memory_Type) {
		this.memory_Type = memory_Type;
	}
	@Column(name="socket_Type")
	public String getSocket_Type() {
		return socket_Type;
	}
	public void setSocket_Type(String socket_Type) {
		this.socket_Type = socket_Type;
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
