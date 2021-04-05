package pojos;

import javax.persistence.*;

@Entity
@Table(name="graphic_Card")
public class Graphic_Card {
	private int product_Id;
	private String graphic_Card_Model,brand,chipset,memory_Type,gpu,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Graphic_Card() {
		// TODO Auto-generated constructor stub
	}
	public Graphic_Card(int product_Id, String graphic_Card_Model, String brand, String chipset, String memory_Type,
			String gpu, String link_Primeabgb, String link_Amazon, String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.graphic_Card_Model = graphic_Card_Model;
		this.brand = brand;
		this.chipset = chipset;
		this.memory_Type = memory_Type;
		this.gpu = gpu;
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
	@Column(name="graphic_Card_Model")
	public String getGraphic_Card_Model() {
		return graphic_Card_Model;
	}
	public void setGraphic_Card_Model(String graphic_Card_Model) {
		this.graphic_Card_Model = graphic_Card_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="chipset")
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	@Column(name="memory_Type")
	public String getMemory_Type() {
		return memory_Type;
	}
	public void setMemory_Type(String memory_Type) {
		this.memory_Type = memory_Type;
	}
	@Column(name="gpu")
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
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
