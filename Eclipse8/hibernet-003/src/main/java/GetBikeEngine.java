import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		
		String jqpl = "	SELECT b FROM Bike b";
		Query q  = em.createQuery(jqpl);
		List<Bike> bikes = q.getResultList();
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		for(Bike b : bikes) {
			System.out.println("*****Bike Details*****");
			System.out.println();
			System.out.println(b.getBid());
			System.out.println(b.getName());
			System.out.println(b.getPrice());
			System.out.println(b.getColor());
			System.out.println();
			System.out.println("*****Engine Details*****");
			System.out.println();
			BEngine be = b.getBe();
			System.out.println(be.getEid());
			System.out.println(be.getCc());
			System.out.println(be.getEstork());
			System.out.println();
			System.out.println("--------------------------");
		}
	}
}

