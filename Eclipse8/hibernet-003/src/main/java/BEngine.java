import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BEngine {
	
	@Id
	private int eid;
	private int estork;
	private int cc;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEstork() {
		return estork;
	}
	public void setEstork(int estork) {
		this.estork = estork;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
