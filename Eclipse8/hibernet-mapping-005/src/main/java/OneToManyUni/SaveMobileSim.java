package OneToManyUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Sim s1 = new Sim();
		s1.setId(201);
		s1.setName("Jio");
		s1.setType("4G");
		
		Sim s2 = new Sim();
		s2.setId(202);
		s2.setName("Airtel");
		s2.setType("5G");
		
		List<Sim> sims = new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s2);
		
		Mobile m = new Mobile();
		m.setMid(101);
		m.setName("Apple i phone 14 max pro");
		m.setPrice(1200000);
		m.setS(sims);
		
		et.begin();
		em.persist(m);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
	}
}
