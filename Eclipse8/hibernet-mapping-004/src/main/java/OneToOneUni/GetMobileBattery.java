package OneToOneUni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMobileBattery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT m FROM Mobile m";
		Query q = em.createQuery(jpql);
		List<Mobile> mli = q.getResultList();
		
		System.out.println();
		System.out.println("----------------------------------------");
		for (Mobile m : mli) {
			System.out.println();
			System.out.println("*********Mobile Details*********");
			System.out.println();
			System.out.println("mobile id : " + m.getMid());
			System.out.println("mobile brand :" + m.getMbrand());
			System.out.println("mobile price :" + m.getPrice());
			Batery b = m.getB();
			System.out.println();
			System.out.println("*********Batery Details*********");
			System.out.println();
			System.out.println("battery id :" + b.getBid());
			System.out.println("battery mah :" + b.getMah());
			System.out.println("battery type:" + b.getType());
			System.out.println();
			System.out.println("----------------------------------------");

		}
	}
}
