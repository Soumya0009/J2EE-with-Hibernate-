package OneToManyBi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	private int aid;
	private int ano;
	private String name;
	
	@ManyToOne
	private Person p;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}
	
}
