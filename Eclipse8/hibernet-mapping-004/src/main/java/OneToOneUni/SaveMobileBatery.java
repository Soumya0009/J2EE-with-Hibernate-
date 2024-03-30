package OneToOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileBatery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Batery b = new Batery();
		b.setMah(4422);
		b.setType("Lithium");
		
		Mobile m = new Mobile();
		m.setMbrand("MOTOROLA");
		m.setPrice(28000);
		m.setB(b);
		
		et.begin();
		em.persist(m);
		em.persist(b);
		et.commit();
	}

}
