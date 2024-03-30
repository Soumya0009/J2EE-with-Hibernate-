package OneToOneUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String mbrand;
	private double price;
	
	@OneToOne
	private Batery b;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMbrand() {
		return mbrand;
	}

	public void setMbrand(String mbrand) {
		this.mbrand = mbrand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Batery getB() {
		return b;
	}

	public void setB(Batery b) {
		this.b = b;
	}
	
}
