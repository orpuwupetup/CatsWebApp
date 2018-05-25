package orpuwupetup.example.com.cats.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CatDTO {
	
	@NotBlank
	private String name;
	
	@NotBlank
	@Pattern(regexp="[1-2][0-9]{3}\\.[0-1]?[0-9]\\.[0-3]?[0-9]", message="must be in yyyy.MM.dd format")
	private String birthDate;
	
	@NotBlank
	private String ownersName;
	
	@NotNull
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
}