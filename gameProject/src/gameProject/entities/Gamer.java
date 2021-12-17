package gameProject.entities;

public class Gamer {
	int gamerId;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String nationalityId;
 
	public Gamer(int gamerId, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
