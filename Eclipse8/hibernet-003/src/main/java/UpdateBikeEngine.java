import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateBikeEngine {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		BEngine be = em.find(BEngine.class, 201);
		
		be.setCc(199);
	
		
		Bike b = em.find(Bike.class, 101);
		
		b.setName("KTM Duke");
		
		
		
		
		et.begin();
		em.merge(b);
		em.merge(be);
		et.commit();
	}

}
