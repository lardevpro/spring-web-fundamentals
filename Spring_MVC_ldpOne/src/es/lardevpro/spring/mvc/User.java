package es.lardevpro.spring.mvc;


enum Sex {
	HOMBRE,
	MUJER
}

public class User {
	
	private String name;
	
	private String lastName;
	
	private Sex sex;
	
	
	
	
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
	

}
