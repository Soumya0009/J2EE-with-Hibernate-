package OneToOneBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Person p = em.find(Person.class, 102);
		p.setName("Jhon Cina");
		p.setGender("Male");

		Adhar a = em.find(Adhar.class, 202);

		a.setPin(125456789100l);

		p.setA(a);
		a.setP(p);

		et.begin();
		em.merge(p);
		em.merge(a);
		et.commit();
	}
}
