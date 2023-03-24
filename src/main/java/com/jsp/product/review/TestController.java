package com.jsp.product.review;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Product product=new Product();
	
		
		Review review=new Review();
		
		Review r1=new Review();
		r1.setStatus("Good");
		r1.setRating(3);
		r1.setProduct(product);
		
		Review r2=new Review();
		r2.setStatus("Very Good");
		r2.setRating(4);
		r2.setProduct(product);
		
		ArrayList< Review>a1=new ArrayList();
		a1.add(r1);
		a1.add(r2);
		
		product.setBrand("Lee corpse");
		product.setName("Jeans");
		product.setType("Clothy");
		product.setCost(1000);
		product.setReviews(a1);
		
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(r1);
		entityManager.persist(r2);
	

		entityTransaction.commit();
		System.out.println("all good");
		
		
		


	}

}
