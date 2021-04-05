package pojos;

import javax.persistence.*;

@Entity
@Table(name="technician")
public class Technician {
	
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String contact;
	private String qualification;
	private String city;
	private String state;
	private String pincode;
	
	public Technician() {
		
	}

	public Technician(String fname, String lname, String email, String contact, String qualification,
			String city, String state, String pincode) {
	
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.qualification = qualification;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="fname")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	@Column(name="lname")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="contact")
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Column(name="qualification")
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Column(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Column(name="pincode")
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
}
