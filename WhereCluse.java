
package com.techno.j2ee.hibernate.jpql;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.techno.j2ee.hibernate.dto.Student;

import antlr.collections.List;
public class WhereCluse {

public static void main(String[] args) {
	EntityManagerFactory factory=null;
	 EntityManager entityManager=null;
	 EntityTransaction transaction=null;
	 try {
	 factory = Persistence.createEntityManagerFactory("hibernate");
	 entityManager = factory.createEntityManager();
	


	 String query="select name from Student where id=1";
	 Query createQuery = entityManager.createQuery(query);
	 Object resultList =  createQuery.getSingleResult();
	
	 System.out.println(resultList);
	 

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
