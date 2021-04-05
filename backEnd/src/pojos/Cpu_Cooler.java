package pojos;

import javax.persistence.*;

@Entity
@Table(name="cpu_Cooler")
public class Cpu_Cooler {
	private int product_Id;
	private String cpu_Cooler_Model,brand,air_Flow,noise,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Cpu_Cooler() {
		// TODO Auto-generated constructor stub
	}
	public Cpu_Cooler(int product_Id, String cpu_Cooler_Model, String brand, String air_Flow, String noise,
			String link_Primeabgb, String link_Amazon, String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.cpu_Cooler_Model = cpu_Cooler_Model;
		this.brand = brand;
		this.air_Flow = air_Flow;
		this.noise = noise;
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
	@Column(name="cpu_Cooler_Model")
	public String getCpu_Cooler_Model() {
		return cpu_Cooler_Model;
	}
	public void setCpu_Cooler_Model(String cpu_Cooler_Model) {
		this.cpu_Cooler_Model = cpu_Cooler_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="air_Flow")
	public String getAir_Flow() {
		return air_Flow;
	}
	public void setAir_Flow(String air_Flow) {
		this.air_Flow = air_Flow;
	}
	@Column(name="noise")
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
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
	@Override
	public String toString() {
		return "cpu_Cooler [product_Id=" + product_Id + ", cpu_Cooler_Model=" + cpu_Cooler_Model + ", brand=" + brand
				+ ", air_Flow=" + air_Flow + ", noise=" + noise + ", link_Primeabgb=" + link_Primeabgb
				+ ", link_Amazon=" + link_Amazon + ", link_Mdcomputers=" + link_Mdcomputers + ", price=" + price + "]";
	}
	
	
}
