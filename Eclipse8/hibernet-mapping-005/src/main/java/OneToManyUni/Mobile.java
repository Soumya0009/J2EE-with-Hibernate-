package OneToManyUni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	@Id
	private int mid;
	private String name;
	private double price;
	
	@OneToMany
	private List<Sim> s;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Sim> getS() {
		return s;
	}

	public void setS(List<Sim> s) {
		this.s = s;
	}
	
}
