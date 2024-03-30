package usingHibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonHibernateAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Welcome to Person entry Form***");
		System.out.println("Please select a service.");
		System.out.println("Press '1' for Add person data.");
		
		System.out.println("Press '2' for Update person data.");
		
		System.out.println("Press '3' for Delete person data.");
		
		System.out.println("Press '4' for Get all person data.");
		
		System.out.println("Press '5' for Get individual person data.");
		System.out.print("Enter your choice: ");
		int update = sc.nextInt();
		
		if (update==1) {
			System.out.println("Enter person details.");
			System.out.print("Enter person Id: ");
			int id = sc.nextInt();
					 sc.nextLine();
			System.out.print("Enter person Name: ");
			String name = sc.nextLine();
			System.out.print("Enter person Age: ");
			int age = sc.nextInt();
			 		 sc.nextLine();
			System.out.print("Enter person Gender: ");
			String gender = sc.nextLine();
			System.out.print("Enter person 10digits Phone no: ");
			long phone = sc.nextLong();
			
			Person p = new Person();
			p.setId(id);
			p.setName(name);
			p.setAge(age);
			p.setGender(gender);
			p.setPhone(phone);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.persist(p);
			et.commit();
		}else if (update == 2) {
			System.out.println("Update person details.");
			System.out.print("Enter person Id to Update: ");
			int id = sc.nextInt();
					 sc.nextLine();
			System.out.print("Enter person Updted Name: ");
			String name = sc.nextLine();
			System.out.print("Enter person Updated Age: ");
			int age = sc.nextInt();
			 		 sc.nextLine();
			System.out.print("Enter person Updated Gender: ");
			String gender = sc.nextLine();
			System.out.print("Enter person 10digits Updated Phone no: ");
			long phone = sc.nextLong();
			
			Person p = new Person();
			p.setId(id);
			p.setName(name);
			p.setAge(age);
			p.setGender(gender);
			p.setPhone(phone);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.merge(p);
			et.commit();
		} else if (update == 3) {
			System.out.println("Delete person details.");
			System.out.print("Enter person Id to Delete: ");
			int id = sc.nextInt();
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
			EntityManager em = emf.createEntityManager();
			EntityTransaction  et = em.getTransaction();
			
			Person p = em.find(Person.class,id);
			
			et.begin();
			em.remove(p);
			et.commit();
		} else if (update == 4) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
			EntityManager em = emf.createEntityManager();
			
			String hql = "SELECT p FROM Person p";
			Query q = em.createQuery(hql);
			List<Person> cl=q.getResultList(); 
			
			System.out.println("|-------------------------|");
			
			for (Person p : cl) {
				
				System.out.println(p.getId());
				
				System.out.println(p.getName());
				
				System.out.println(p.getAge());
				
				System.out.println(p.getGender());
				
				System.out.println(p.getPhone());
				System.out.println("|-------------------------|");
			}
		} else if (update == 5) {
			System.out.println("Get person details.");
			System.out.print("Enter person Id to Get: ");
			int id = sc.nextInt();
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("balaji");
			EntityManager em = emf.createEntityManager();
			 Person p = em.find(Person.class,id);
			 System.out.println("|-------------------------|");
				System.out.println(p.getId());
				
				System.out.println(p.getName());
				
				System.out.println(p.getAge());
				
				System.out.println(p.getGender());
				
				System.out.println(p.getPhone());
				
				System.out.println("|-------------------------|");
		} else {
		    System.out.println("Invalid input. Please try again.");
		}
	}
}
