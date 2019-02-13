package com.user.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
	private static SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static Session openSession() {
		Session session = sessionFactory.openSession();
		return session;
	}

	public static void closeSession(Session session) {
		if (null != session) {
			session.close();
		}
	}
}
