package pojos;



import javax.persistence.*;

@Entity
@Table(name="processor")
public class Processor {
	private int product_Id;
	private String proc_Model,brand,cores,frequency,socket_Type,link_Flipkart,link_Amazon,link_Mdcomputers;
	private int price;
	public Processor() {
		
	}
	public Processor(int product_Id, String proc_Model, String brand, String cores, String frequency,
			String socket_Type, String link_Flipkart, String link_Amazon, String link_Mdcomputers, int price) {
		
		this.product_Id = product_Id;
		this.proc_Model = proc_Model;
		this.brand = brand;
		this.cores = cores;
		this.frequency = frequency;
		this.socket_Type = socket_Type;
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
	@Column(name="proc_Model")
	public String getProc_Model() {
		return proc_Model;
	}
	public void setProc_Model(String proc_Model) {
		this.proc_Model = proc_Model;
	}
	@Column(name="brand")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="cores")
	public String getCores() {
		return cores;
	}
	public void setCores(String cores) {
		this.cores = cores;
	}
	@Column(name="frequency")
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	@Column(name="socket_Type")
	public String getSocket_Type() {
		return socket_Type;
	}
	public void setSocket_Type(String socket_Type) {
		this.socket_Type = socket_Type;
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