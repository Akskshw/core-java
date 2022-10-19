package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Country;
import dto.Player;
import dto.State;
import dto.Team;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("teamUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		// state object
		State karnataka= new State();
		karnataka.setName("Karnataka");
		State kerala= new State();
		kerala.setName("Kerala");
		State tamil= new State();
		tamil.setName("Tamilnadu");
		State mumbai= new State();
		mumbai.setName("Maharastra");
		ArrayList<State> states =new ArrayList<State>();
		states.add(kerala);
		states.add(mumbai);
		states.add(tamil);
		states.add(karnataka);


		//country object
		Country country=new Country();
		country.setName("India");
		country.setListofstate(states);
		 //team object
		Team team= new Team();
		team.setTname("TeamIndia");
		//player object
		Player pla= new Player();
		pla.setName("Dhoni");
		pla.setAge(38);
		pla.setSalary(8000000L);
		pla.setCountry(country);
		
		
	entityManager.persist(pla);
//	entityManager.persist(team);	
//	entityManager.persist(country);
//	entityManager.persist(karnataka);	
	entityTransaction.commit();
	entityManager.close();
	entityManagerFactory.close();
	
	}

}
