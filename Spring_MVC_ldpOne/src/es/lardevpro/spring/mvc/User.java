package es.lardevpro.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@Size(min=3, message=" Campo requerido (al menos 3 carácteres)")
	private String name;
	
	@NotNull
	@Size(min=3, message=" Campo requerido (al menos 3 carácteres)")
	private String lastName;
	
	@NotNull
	@Min(value=10, message=" Debe ser mayor de 10 años")
	@Max(value=100, message=" Si tiene más de 100 años debe contactar con soporte")
	private int age;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	private Sex sex;
	
	@NotNull
	private String country;
	
	@NotNull
	@Pattern(regexp="[0-9]{5}", message=" Deben ser 5 valores numéricos")
	private String cp;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}


}
