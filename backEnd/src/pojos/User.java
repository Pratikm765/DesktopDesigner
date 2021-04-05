package pojos;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
	
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String city;
	private String state;
	private String pincode;
	
	
	
	public User() {
	}

	public User( String fname, String lname, String email, String password, String city, String state,
			String pincode) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
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
	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
