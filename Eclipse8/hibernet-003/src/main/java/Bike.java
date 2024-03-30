import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	private int bid;
	private String name;
	private String color;
	private double price;
	@OneToOne
	private BEngine be;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BEngine getBe() {
		return be;
	}

	public void setBe(BEngine be) {
		this.be = be;
	}
	
	
}
