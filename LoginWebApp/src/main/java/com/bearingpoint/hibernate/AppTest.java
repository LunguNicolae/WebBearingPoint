/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.hibernate;

import com.bearingpoint.entities.Book;
import com.bearingpoint.service.impl.BookServiceImpl;
import com.bearingpoint.service.intf.GeneralServiceIntf;

import java.util.List;

public class AppTest {
    public static void main(String[] args) {
		
    	GeneralServiceIntf bookService = new BookServiceImpl();
		Book book1 = new Book("8", "The Brothers Karamazov", "Fyodor Dostoevsky");
		Book book2 = new Book("9", "War and Peace", "Leo Tolstoy");
		Book book3 = new Book("10", "Pride and Prejudice", "Jane Austen");
		System.out.println("*** Persist - start ***");
		bookService.persist(book1);
		bookService.persist(book2);
		bookService.persist(book3);
		List<Book> books1 = bookService.findAll();
		System.out.println("Books Persisted are :");
		for (Book b : books1) {
			System.out.println("-" + b.toString());
		}
		System.out.println("*** Persist - end ***");
		System.out.println("*** Update - start ***");
		book1.setTitle("The Idiot");
		bookService.update(book1);
		System.out.println("Book Updated is =>" +bookService.findById(book1.getId()).toString());
		System.out.println("*** Update - end ***");
		System.out.println("*** Find - start ***");
		String id1 = book1.getId();
		Book another = (Book) bookService.findById(id1);
		System.out.println("Book found with id " + id1 + " is =>" + another.toString());
		System.out.println("*** Find - end ***");
		System.out.println("*** Delete - start ***");
		String id3 = book3.getId();
		bookService.delete(book3);
		System.out.println("Deleted book with id " + id3 + ".");
		System.out.println("Now all books are " + bookService.findAll().size() + ".");
		System.out.println("*** Delete - end ***");
		System.out.println("*** FindAll - start ***");
		List<Book> books2 = bookService.findAll();
		System.out.println("Books found are :");
		for (Book b : books2) {
			System.out.println("-" + b.toString());
		}
		System.out.println("*** FindAll - end ***");
		System.out.println("*** DeleteAll - start ***");
//		bookService.delete(book3);
		System.out.println("Books found are now " + bookService.findAll().size());
		System.out.println("*** DeleteAll - end ***");
		 System.exit(0);
	}

}
