package es.lardevpro.spring.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@Size(min=3, message="Campo requerido")
	private String name;
	
	@NotNull
	@Size(min=3, message="Campo requerido")
	private String lastName;
	
	@NotNull
	private Sex sex;
	
	@NotNull
	private String country;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Sex getSex() {
		return sex;
	}
	
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
