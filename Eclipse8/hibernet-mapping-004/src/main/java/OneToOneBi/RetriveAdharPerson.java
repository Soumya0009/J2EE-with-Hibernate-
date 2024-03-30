package OneToOneBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RetriveAdharPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		
		String jpql ="SELECT a From Adhar a";
		Query q = em.createQuery(jpql);
		List<Adhar> ali = q.getResultList();
		
		for(Adhar a: ali) {
			
			System.out.println(a);
			System.out.println("Adhar Id	:  "+a.getId());
			System.out.println("Adhar Pin	:  "+a.getPin());
			System.out.println("Gender	 	:  "+a.getGender());
			Person p = a.getP();
			System.out.println("Person Id	: "+p.getId());
			System.out.println("Person Pin	: "+p.getName());
			System.out.println("Person Gender 	: "+p.getGender());
			
		}
	}
}
