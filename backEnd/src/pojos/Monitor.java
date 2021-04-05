package pojos;

import javax.persistence.*;

@Entity
@Table(name="monitor")
public class Monitor {
	private int product_Id;
	private String monitor_Model,brand,type,screen_Size,display_Resolution,aspect_Ratio,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	private String image;
	public Monitor() {
		// TODO Auto-generated constructor stub
	}
	public Monitor(int product_Id, String monitor_Model, String brand, String type, String screen_Size,
			String display_Resolution, String aspect_Ratio, String link_Primeabgb, String link_Amazon,
			String link_Mdcomputers, int price, String image) {
		super();
		this.product_Id = product_Id;
		this.monitor_Model = monitor_Model;
		this.brand = brand;
		this.type = type;
		this.screen_Size = screen_Size;
		this.display_Resolution = display_Resolution;
		this.aspect_Ratio = aspect_Ratio;
		this.link_Primeabgb = link_Primeabgb;
		this.link_Amazon = link_Amazon;
		this.link_Mdcomputers = link_Mdcomputers;
		this.price = price;
		this.image = image;
	}
	@Id
	@Column(name="product_Id")
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	@Column(name="monitor_Model")
	public String getMonitor_Model() {
		return monitor_Model;
	}
	public void setMonitor_Model(String monitor_Model) {
		this.monitor_Model = monitor_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="screen_Size")
	public String getScreen_Size() {
		return screen_Size;
	}
	public void setScreen_Size(String screen_Size) {
		this.screen_Size = screen_Size;
	}
	@Column(name="display_Resolution")
	public String getDisplay_Resolution() {
		return display_Resolution;
	}
	public void setDisplay_Resolution(String display_Resolution) {
		this.display_Resolution = display_Resolution;
	}
	@Column(name="aspect_Ratio")
	public String getAspect_Ratio() {
		return aspect_Ratio;
	}
	public void setAspect_Ratio(String aspect_Ratio) {
		this.aspect_Ratio = aspect_Ratio;
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
	@Column(name="image")
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
