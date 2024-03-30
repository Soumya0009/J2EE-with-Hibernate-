import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		
		String jpql ="SELECT c From Car c";
		Query q = em.createQuery(jpql);
		List<Car> cars = q.getResultList();
		
		for(Car c: cars) {
			
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getColor());
			System.out.println(c.getPrice());
			Engine e = c.getE();
			System.out.println("Engine object.");
			System.out.println("--------------");
			System.out.println(e.getId());
			System.out.println(e.getCc());
			System.out.println(e.getValves());
			System.out.println("------------------------------");
		}
		
	}
}
