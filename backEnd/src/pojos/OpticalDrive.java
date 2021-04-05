package pojos;

import javax.persistence.*;

@Entity
@Table(name="OpticalDrive")
public class OpticalDrive {
	private int product_Id;
	private String model,brand,cost_Primeabgb,cost_Amazon,cost_Mdcomputers;
	private int price;
	public OpticalDrive() {
		// TODO Auto-generated constructor stub
	}
	public OpticalDrive(int product_Id, String model, String brand, String cost_Primeabgb, String cost_Amazon,
			String cost_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.model = model;
		this.brand = brand;
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
	@Column(name="model")
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	@Override
	public String toString() {
		return "OpticalDrive [product_Id=" + product_Id + ", model=" + model + ", brand=" + brand + ", cost_Primeabgb="
				+ cost_Primeabgb + ", cost_Amazon=" + cost_Amazon + ", cost_Mdcomputers=" + cost_Mdcomputers
				+ ", price=" + price + "]";
	}
	
}
