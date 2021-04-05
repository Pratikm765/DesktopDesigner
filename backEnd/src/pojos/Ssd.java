package pojos;

import javax.persistence.*;

@Entity
@Table(name="ssd")
public class Ssd {
	private int product_Id;
	private String ssd_Model,brand,size,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	public Ssd() {
	}
	public Ssd(String ssd_Model, String brand, String size, String link_Primeabgb, String link_Amazon,
			String link_Mdcomputers, int price) {
		this.ssd_Model = ssd_Model;
		this.brand = brand;
		this.size = size;
		this.link_Primeabgb = link_Primeabgb;
		this.link_Amazon = link_Amazon;
		this.link_Mdcomputers = link_Mdcomputers;
		this.price = price;
	}
	@Id
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getSsd_Model() {
		return ssd_Model;
	}
	public void setSsd_Model(String ssd_Model) {
		this.ssd_Model = ssd_Model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLink_Primeabgb() {
		return link_Primeabgb;
	}
	public void setLink_Primeabgb(String link_Primeabgb) {
		this.link_Primeabgb = link_Primeabgb;
	}
	public String getLink_Amazon() {
		return link_Amazon;
	}
	public void setLink_Amazon(String link_Amazon) {
		this.link_Amazon = link_Amazon;
	}
	public String getLink_Mdcomputers() {
		return link_Mdcomputers;
	}
	public void setLink_Mdcomputers(String link_Mdcomputers) {
		this.link_Mdcomputers = link_Mdcomputers;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
