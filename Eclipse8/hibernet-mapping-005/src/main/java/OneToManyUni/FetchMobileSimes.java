package OneToManyUni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchMobileSimes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		String jpql = "SELECT m FROM Mobile m";
		Query q = em.createQuery(jpql);
		List<Mobile> mobiles =q.getResultList();
		for(Mobile m : mobiles) {
			
			System.out.println("----------------------------------------");
			System.out.println("Mobile Id :"+m.getMid());
			System.out.println("Mobile brand: "+m.getName());
			System.out.println("Mobile price: "+m.getPrice());
			
			List<Sim> sims = m.getS();
			for(Sim s : sims) {
				System.out.println("Sim Id :"+s.getId());
				System.out.println("Sim Service: "+s.getName());
				System.out.println("Sim Type: "+s.getType());
			}
			System.out.println("----------------------------------------");
			
		}
	}
}
