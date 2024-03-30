package OneToOneBi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adhar {
	
	@Id
	private int id;
	private long pin;
	private String gender;
	
	@OneToOne
	private Person p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}
}
