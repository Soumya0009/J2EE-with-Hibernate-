package usingHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.setId(104);
		c.setName("Suzuki Alto");
		c.setPrice(250000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(c);
		et.commit();
	}

}
