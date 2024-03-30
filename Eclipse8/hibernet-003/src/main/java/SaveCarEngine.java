import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCarEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e = new Engine();
		e.setId(203);
		e.setValves(8);
		e.setCc(6500);
		
		Car c = new Car();
		c.setId(103);
		c.setName("Lamborghini Huracane");
		c.setColor("White");
		c.setPrice(52000000);
		c.setE(e);
		
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
	}
}
