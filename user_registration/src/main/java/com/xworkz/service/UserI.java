package com.xworkz.service;

import com.xworkz.dto.UserDTO;

public interface UserI {
public void saveUser(UserDTO user);
public UserDTO findUserById(int id);
public void deleteUserById(int id);
public UserDTO loginUserById(String email, String password);
public UserDTO updateUser(UserDTO user);


}
