
package com.techno.j2ee.hibernate.jpql;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.techno.j2ee.hibernate.dto.Student;

import antlr.collections.List;
public class DeleteQuery {

public static void main(String[] args) {
	EntityManagerFactory factory=null;
	 EntityManager entityManager=null;
	 EntityTransaction entityTransaction=null;
	 try {
	 factory = Persistence.createEntityManagerFactory("hibernate");
	 entityManager = factory.createEntityManager();
	 entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();

	 String query="delete from Student where id=2";
	 Query createQuery = entityManager.createQuery(query);
	 int executeUpdate = createQuery.executeUpdate();
	
	 System.out.println(executeUpdate+" row affected");
	 entityTransaction.commit();

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
