package es.lardevpro.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import es.lardevpro.spring.mvc.customValidations.ZipCode;

public class User {
	
	@NotBlank(message="Debe rellenar el campo Nombre")
	@Size(min=3, message=" Campo requerido con al menos 3 car�cteres")
	private String name;
	
	@NotBlank(message="Debe rellenar el campo Apellidos")
	@Size(min=3, message=" Campo requerido al menos 3 car�cteres")
	private String lastName;
	
	@NotNull(message = "Debe rellenar el campo Edad")
	@Min(value=10, message=" Debe ser mayor de 10 a�os")
	@Max(value=100, message=" Si tiene m�s de 100 a�os debe contactar con soporte")
	private int age;
	
	@NotBlank(message = "El campo E-Mail no puede estar vac�o")
	@Email(message = "El formato del email no es v�lido")
	private String email;
	
	
	private Sex sex;
	
	
	private String country;
	
	@ZipCode(message = "Introduce un c�digo postal v�lido en Espa�a")
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
