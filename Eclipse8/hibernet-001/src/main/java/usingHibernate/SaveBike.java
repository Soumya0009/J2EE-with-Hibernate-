package usingHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBike {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.setBid(101);
		b.setBname("Suzuki Hayabusa");
		b.setBprice(1600000);
		b.setBcc(1340);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(b);
		et.commit();
	}
}
