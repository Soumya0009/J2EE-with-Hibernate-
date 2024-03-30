package ManyToOneBi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetBranchHospital {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("SELECT b FROM Branch b");
		List<Branch> branches = q.getResultList();
		
		for(Branch b : branches) {
			
			System.out.println(b.getBid());
			System.out.println(b.getLoc());
			System.out.println(b.getHospital().getHid());
			System.out.println(b.getHospital().getHname());
		}
	}
}
