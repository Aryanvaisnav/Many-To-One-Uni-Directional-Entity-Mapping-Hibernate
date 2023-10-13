package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Wockhardt");
		
		HospitalBranch branch1 = new HospitalBranch();
		branch1.setCapacity(278);
		branch1.setCity("Lucknow");
		branch1.setState("Uttar Pradesh");
		branch1.setCountry("India");
		
		HospitalBranch branch2 = new HospitalBranch();
		branch2.setCapacity(237);
		branch2.setCity("Ahmedabad");
		branch2.setState("Gujarat");
		branch2.setCountry("India");
		
		HospitalBranch branch3 = new HospitalBranch();
		branch3.setCapacity(420);
		branch3.setCity("Mumbai");
		branch3.setState("Maharashtra");
		branch3.setCountry("India");
		
		HospitalBranch branch4 = new HospitalBranch();
		branch4.setCapacity(326);
		branch4.setCity("Hyderabad");
		branch4.setState("Telangana");
		branch4.setCountry("India");
		
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		branch4.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityTransaction.commit();
		

		
	}

}
