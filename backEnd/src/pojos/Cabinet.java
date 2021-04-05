package pojos;

import javax.persistence.*;

@Entity
@Table(name="cabinet")
public class Cabinet {
	private int product_Id;
	private String cabinet_Model,brand,type,link_Primeabgb,link_Amazon,link_Mdcomputers;
	private int price;
	private String image;
	public Cabinet() {
		// TODO Auto-generated constructor stub
	}
	public Cabinet(int product_id,String cabinet_Model, String brand, String type, String link_Primeabgb, String link_Amazon,
			String link_Mdcomputers, int price, String image) {
		super();
		this.product_Id=product_id;
		this.cabinet_Model = cabinet_Model;
		this.brand = brand;
		this.type = type;
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
	@Column(name="cabinet_Model")
	public String getCabinet_Model() {
		return cabinet_Model;
	}
	public void setCabinet_Model(String cabinet_Model) {
		this.cabinet_Model = cabinet_Model;
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
	@Override
	public String toString() {
		return "Cabinet [product_Id=" + product_Id + ", cabinet_Model=" + cabinet_Model + ", brand=" + brand + ", type="
				+ type + ", link_Primeabgb=" + link_Primeabgb + ", link_Amazon=" + link_Amazon + ", link_Mdcomputers="
				+ link_Mdcomputers + ", price=" + price + ", image=" + image + "]";
	}
	
	
	
}
