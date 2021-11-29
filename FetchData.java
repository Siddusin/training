
package com.techno.j2ee.hibernate.jpql;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.techno.j2ee.hibernate.dto.Student;

import antlr.collections.List;
public class FetchData {

public static void main(String[] args) {
	EntityManagerFactory factory=null;
	 EntityManager entityManager=null;
	 EntityTransaction transaction=null;
	 try {
	 factory = Persistence.createEntityManagerFactory("hibernate");
	 entityManager = factory.createEntityManager();
	


	 String query="from Student";
	 Query createQuery = entityManager.createQuery(query);
	 java.util.List resultList = createQuery.getResultList();
	 for (Object object : resultList) {
		System.out.println(object);
	}
	 

	 

	 }catch (Exception e) {
		 e.printStackTrace();
	}finally {
		if(factory!=null) {
			factory.close();
		}
		if(entityManager!=null) {
			entityManager.close();
		}

	 
}
}
}
