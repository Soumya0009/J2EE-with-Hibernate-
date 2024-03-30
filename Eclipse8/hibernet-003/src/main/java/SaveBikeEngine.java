import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		BEngine be = new BEngine();
		be.setEid(202);
		be.setCc(200);
		be.setEstork(4);
		
		Bike b = new Bike();
		b.setBid(102);
		b.setName("KTM RC 200");
		b.setColor("Orange");
		b.setPrice(200005);
		b.setBe(be);
		
		et.begin();
		em.persist(b);
		em.persist(be);
		et.commit();
		
	}
}
