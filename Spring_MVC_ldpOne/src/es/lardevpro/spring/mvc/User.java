package es.lardevpro.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
	@Min(value=10, message="Debe ser mayor de 10 a�os")
	@Max(value=100, message="Si tiene m�s de 100 a�os debe contactar con soporte")
	private int age;
	
	@Email
	private String email;
	
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
	

}
