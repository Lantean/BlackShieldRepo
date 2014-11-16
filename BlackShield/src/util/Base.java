package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Base {
	
	public static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("persistence.xml");
			return cfg.buildSessionFactory();
			
		} catch (Exception e) {
			System.out.println("Falha na criação do SessionFactory: " + e);
			throw new ExceptionInInitializerError();
		}
		
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
}
