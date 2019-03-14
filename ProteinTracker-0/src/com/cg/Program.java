package com.cg;

import org.hibernate.Session;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		System.out.println("Session started: "+ session.isConnected());
		session.beginTransaction();
		User user = new User();
		user.setName("Akshay");
		user.setGoal(250);
		user.setTotal(100);
		session.save(user);
		session.getTransaction().commit();
		session.beginTransaction();

		User loadedUser = (User) session.load(User.class, 1);
		System.out.println(loadedUser.getName());
		System.out.println(loadedUser.getGoal());

		loadedUser.setTotal(loadedUser.getTotal() + 50);

		session.getTransaction().commit();
		System.out.println(session.getSessionFactory());
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
}
