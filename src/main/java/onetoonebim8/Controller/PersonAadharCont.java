package onetoonebim8.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim8.dao.AadharCardDao;
import onetoonebim8.dao.PersonDao;
import onetoonebim8.dto.AadharCard;
import onetoonebim8.dto.Person;

public class PersonAadharCont {

	public static void main(String[] args) {


	/*	Person person = new Person();
		person.setId(2);
		person.setName("ChalamaReddy");
		person.setAddress("banglore");
		
		AadharCard aadharCard = new AadharCard();
		aadharCard.setId(102);
		aadharCard.setName("ChalamaReddy");
		aadharCard.setAge(22);
		
		person.setAadharCard(aadharCard);
		aadharCard.setPerson(person);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadharCard);
		entityTransaction.commit();

		
	/*	PersonDao dao = new PersonDao();
		dao.UpdatePerson(2, person);
		
		AadharCardDao cardDao = new AadharCardDao();
		cardDao.UpdateAadharcard(102, aadharCard);
		*/
		
	/*	PersonDao dao = new PersonDao();
		dao.findPerson(2);
		
		AadharCardDao cardDao = new AadharCardDao();
		cardDao.findAadharcard(102);
		*/
		
		
	//	PersonDao dao = new PersonDao();
	//	dao.deletePerson(2);
		
		AadharCardDao cardDao = new AadharCardDao();
		cardDao.deleteAadharcard(102);
		
		
	}

}
