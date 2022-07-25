package com.xworkz.library.crud;

import com.xworkz.library.crud.dto.BooksDTO;

public interface Library {


	 public boolean createBook(BooksDTO book);
	 public void getBookDetails();
	 public boolean updatePublicationByName(String name, String publication);
	 public boolean deleteByName(String name);
	 public boolean deleteByAuthor(String author);
	 public String getBookNameById(int id);
	 public String[] getAllBooksName();
}