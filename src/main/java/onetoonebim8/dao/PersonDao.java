package onetoonebim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;import org.hibernate.dialect.DB2390Dialect;

import onetoonebim8.dto.AadharCard;
import onetoonebim8.dto.Person;

public class PersonDao {
	
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("ram").createEntityManager();
		
	}
	
	public void UpdatePerson(int id, Person person) {
		EntityManager entityManager = getEntityManager();
		Person dbperson = entityManager.find(Person.class, id);
		if(dbperson!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			person.setId(id);
			person.setAadharCard(dbperson.getAadharCard());
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	public void findPerson(int id) {
		EntityManager entityManager = getEntityManager();
		Person dbperson = entityManager.find(Person.class, id);
		if(dbperson!=null) {
			System.out.println(dbperson);
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	public void deletePerson(int id) {
		EntityManager entityManager = getEntityManager();
		Person dbperson = entityManager.find(Person.class, id);
		if(dbperson!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			AadharCard aadharCard= dbperson.getAadharCard();
			aadharCard.setPerson(null);
			entityManager.remove(dbperson);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	

}
