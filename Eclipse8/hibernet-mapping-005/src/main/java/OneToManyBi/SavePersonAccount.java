package OneToManyBi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account a1 = new Account();
		a1.setAid(201);
		a1.setAno(123456);
		a1.setName("SBI");
		
		Account a2 = new Account();
		a2.setAid(202);
		a2.setAno(323456);
		a2.setName("HDFC");
		
		
		List<Account> acs = new ArrayList<Account>();
		acs.add(a1);
		acs.add(a2);
		
		Person p = new Person();
		p.setPid(101);
		p.setPname("Will Smith");
		p.setAge(35);
		p.setA(acs);
		a1.setP(p);
		a2.setP(p);
		
		et.begin();
		em.persist(p);
		em.persist(a1);
		em.persist(a2);
		et.commit();
	}
}
