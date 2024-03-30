package OneToManyBi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private int age;
	@OneToMany
	private List<Account> a;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Account> getA() {
		return a;
	}
	public void setA(List<Account> a) {
		this.a = a;
	}
}
