import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DeleteBike {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction  et = em.getTransaction();
		
		Bike b = em.find(Bike.class,102);
		BEngine be = em.find(BEngine.class, 202);
		et.begin();
		em.remove(b);
		em.remove(be);
		et.commit();
	}
}
