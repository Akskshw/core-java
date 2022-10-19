package com.xworkz.service;

import java.util.List;

import javax.persistence.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.dto.UserDTO;
import com.xworkz.user.util.EntityManagerUtil;

public class UserService  implements UserI{
	EntityManagerUtil entityManagerUtil=new EntityManagerUtil();
	
	public void saveUser(UserDTO user) {
		// TODO Auto-generated method stub
EntityTransaction entityTransaction =entityManagerUtil.getEntityManager().getTransaction();
entityManagerUtil.getEntityManager().persist(user);
entityTransaction.begin();
				entityTransaction.commit();
		entityManagerUtil.getEntityManager().close();
	}

	public UserDTO findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	public UserDTO loginUserById(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserDTO findByUserEmail(String email) {
		Query query= entityManagerUtil.getEntityManager().createNamedQuery("findByEmail");
		query.setParameter("email", email);
	//	BCryptPasswordEncoder  encoder =new BCryptPasswordEncoder();
		//query.setParameter("password",encoder.encode(password));
		//UserDTO user=(UserDTO) query.getResultList();
List<UserDTO> listUser =query.getResultList();
UserDTO retUser=null;
for(UserDTO user:listUser) {
	retUser=user;
}
		return retUser;
	}

}
