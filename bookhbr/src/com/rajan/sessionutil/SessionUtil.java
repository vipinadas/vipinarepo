package com.rajan.sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
public static Session getSession() {
	SessionFactory sessionFactory = new Configuration().configure("com/rajan/configuration/hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	System.out.println("session");
	return session;
	}
public static void closeSession(Session session) {
	
	session.close();
}

}

