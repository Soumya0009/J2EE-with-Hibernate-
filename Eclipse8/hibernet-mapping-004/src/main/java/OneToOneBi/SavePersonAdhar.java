package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAdhar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(103);
		p.setName("Netaji subash Bose");
		p.setGender("male");
		
		Adhar a = new Adhar();
		a.setId(203);
		a.setPin(126456789120l);
		a.setGender("male");
		
		p.setA(a);
		a.setP(p);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
	}
}
