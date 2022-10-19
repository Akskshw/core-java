package com.xworkz.user.util;

import javax.persistence.*;

public class EntityManagerUtil {
	private  EntityManager entityManager;

	 
	public EntityManagerUtil() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("userUnit");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public  EntityManager getEntityManager() {
		return entityManager;
	}
}
