package com.edu.LibrarySystem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory factory= Persistence.createEntityManagerFactory("LibraryDB");
		EntityManager Emf = factory.createEntityManager();
    	
    	Book book = new Book();
    	book.setBookId(102);
    	book.setBookName("Core Java");
    	
    	Users user = new Users();
    	user.setUser_id(1);
    	user.setUser_name("Pooja Shinde");
    	Emf.getTransaction().begin();
    	Emf.persist(book);
    	Emf.getTransaction().commit();
    	Emf.close();
    	factory.close();

    	
    }
}