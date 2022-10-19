package college;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class TestMain {
		public static void main(String[] args) {
			
			CollegeDTO college = new CollegeDTO();
			
			//clg.setC_id(1);
			college.setC_name("MIT");
			college.setC_address("Manipal");
			
			StudentDTO student = new StudentDTO();
			
			student.setS_name("Janu");
			student.setS_address("Mysore");
			
			college.setStudent(student);
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transcation = manager.getTransaction();
			transcation.begin();
			
			manager.persist(college);
			
			transcation.commit();
			manager.close();
			factory.close();

				
			
		}

	}

