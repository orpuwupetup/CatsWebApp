package orpuwupetup.example.com.cats.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat {
	
	private String name;
	private Date birthDate;
	private double weight;
	private String ownersName;
	
	public Cat() {
		// default constructor
	}
	
	// constructor in which we can put all the cats variables at the initialization
	public Cat(String name, Date birthDate, double weight, String ownersName) {
		this.name = name;
		this.birthDate = birthDate;
		this.weight = weight;
		this.ownersName = ownersName;
	}
	
	
	// getter and setter methods for the class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	
	// method to introduce the cat and print all his variables, in formated form
	public String introduceYourself() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
		return "Cats name is: " + this.name + ", Cats birthday is at: " + format.format(this.birthDate) + ", it is weighting: " + this.weight 
				+ " and its own by: " + this.ownersName;
	}
	

}
