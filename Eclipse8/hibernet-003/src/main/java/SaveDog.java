import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDog {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Dog d = new Dog();
		d.setBread("Indian Rajpalyam");
		d.setColor("White");
		
		
		et.begin();
		em.persist(d);
		et.commit();
	}
}
