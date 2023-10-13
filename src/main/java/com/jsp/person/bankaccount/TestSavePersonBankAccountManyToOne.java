package com.jsp.person.bankaccount;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonBankAccountManyToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@gmail.com");
		person.setCno(9777703858l);
		person.setGender("Male");
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setBank_name("AXIS");
		bankAccount1.setAcc_no(8463729463l);
		bankAccount1.setIfsc_code("AXIS7729362478");
		
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setBank_name("SBI");
		bankAccount2.setAcc_no(9364826497l);
		bankAccount2.setIfsc_code("SBI7253926385");
		
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setBank_name("PNB");
		bankAccount3.setAcc_no(8273926592l);
		bankAccount3.setIfsc_code("PNB1753875382");
		
		bankAccount1.setPerson(person);
		bankAccount2.setPerson(person);
		bankAccount3.setPerson(person);
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount1);
		entityManager.persist(bankAccount2);
		entityManager.persist(bankAccount3);
		entityTransaction.commit();
		
		
		

	}

}
