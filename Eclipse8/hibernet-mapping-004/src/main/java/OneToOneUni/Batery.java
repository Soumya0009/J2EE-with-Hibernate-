package OneToOneUni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Batery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private int mah;
	private String type;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getMah() {
		return mah;
	}
	public void setMah(int mah) {
		this.mah = mah;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
