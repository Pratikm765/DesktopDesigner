package pojos;
import javax.persistence.*;

@Entity
@Table(name="hdd")
public class Hdd {
	private int product_Id;
	private String hdd_Model,brand,size,link_Flipkart,link_Amazon,link_Mdcomputers;
	private int price;
	public Hdd() {
		// TODO Auto-generated constructor stub
	}
	public Hdd(int product_Id, String hdd_Model, String brand, String size, String link_Flipkart, String link_Amazon,
			String link_Mdcomputers, int price) {
		super();
		this.product_Id = product_Id;
		this.hdd_Model = hdd_Model;
		this.brand = brand;
		this.size = size;
		this.link_Flipkart = link_Flipkart;
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
	@Column(name="hdd_Model")
	public String getHdd_Model() {
		return hdd_Model;
	}
	public void setHdd_Model(String hdd_Model) {
		this.hdd_Model = hdd_Model;
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
	@Column(name="link_Flipkart")
	public String getLink_Flipkart() {
		return link_Flipkart;
	}
	public void setLink_Flipkart(String link_Flipkart) {
		this.link_Flipkart = link_Flipkart;
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
