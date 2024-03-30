package usingHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et = em.getTransaction();
		
		Car c = em.find(Car.class,104);
		
		et.begin();
		em.remove(c);
		et.commit();
	}
}
