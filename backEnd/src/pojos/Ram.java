package pojos;

import javax.persistence.*;

@Entity
@Table(name="ram")
public class Ram {
	private int product_Id;
	private String ram_Model,brand,size,memory_Type,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Ram() {
		// TODO Auto-generated constructor stub
	}
	public Ram(int product_Id, String ram_Model, String brand, String size, String memory_Type, String link_Primeabgb,
			String link_Amazon, String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.ram_Model = ram_Model;
		this.brand = brand;
		this.size = size;
		this.memory_Type = memory_Type;
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
	@Column(name="ram_Model")
	public String getRam_Model() {
		return ram_Model;
	}
	public void setRam_Model(String ram_Model) {
		this.ram_Model = ram_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="size")
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Column(name="memory_Type")
	public String getMemory_Type() {
		return memory_Type;
	}
	public void setMemory_Type(String memory_Type) {
		this.memory_Type = memory_Type;
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
