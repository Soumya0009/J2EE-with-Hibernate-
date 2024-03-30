package usingHibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;





public class FindAllCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * FOR Single Value
		 * ----------------
		 * Car c = em.find(Car.class,122);
		 * */
		String hql = "SELECT c FROM Car c";
		Query q = em.createQuery(hql);
		List<Car> cl=q.getResultList(); 
		
		for (Car c : cl) {
			
			System.out.println(c.getId());
			
			System.out.println(c.getName());
			
			System.out.println(c.getPrice());
			System.out.println("|-------------------------|");
		}
	}
}
