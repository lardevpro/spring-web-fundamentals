package es.lardevpro.connectionHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customers")
public class Customers {
	
	
	//Const
	public Customers() {
	}

	public Customers(String uName, String lastName, String address) {
		super();
		this.uName = uName;
		this.lastName = lastName;
		this.address = address;
	}


	//Attr
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="u_name")
	private String uName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="address")
	private String address;

	public String getId() {
		return id;
	}


	// Getters and Setters
	public void setId(String id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
