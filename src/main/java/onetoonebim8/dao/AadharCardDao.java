package onetoonebim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim8.dto.AadharCard;
import onetoonebim8.dto.Person;

public class AadharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("ram").createEntityManager();
		
	}
	
	public void UpdateAadharcard(int id,AadharCard aadharCard) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			aadharCard.setPerson(dbAadharCard.getPerson());
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void findAadharcard(int id) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void deleteAadharcard(int id) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Person person = dbAadharCard.getPerson();
			person.setAadharCard(null);
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}

}
