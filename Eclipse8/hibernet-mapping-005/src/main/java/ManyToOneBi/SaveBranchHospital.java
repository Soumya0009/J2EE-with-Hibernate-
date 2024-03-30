package ManyToOneBi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBranchHospital {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital h = new Hospital();
		h.setHid(101);
		h.setHname("Appolo");
		
		Branch b = new Branch();
		b.setBid(201);
		b.setLoc("BBS");
		b.setHospital(h);
		
		Branch b1 = new Branch();
		b1.setBid(202);
		b1.setLoc("DLI");
		b1.setHospital(h);
		
		Branch b2 = new Branch();
		b2.setBid(201);
		b2.setLoc("HYD");
		b2.setHospital(h);
		
		List<Branch> branches=new ArrayList<Branch>();
		branches.add(b);
		branches.add(b1);
		branches.add(b2);
		
		h.setBranches(branches);
		
		et.begin();
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		em.persist(h);
		et.commit();
	}
	
}
