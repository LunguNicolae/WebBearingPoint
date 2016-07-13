/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.service.impl;

import com.bearingpoint.dao.impl.BookDao;
import com.bearingpoint.entities.Book;
import com.bearingpoint.service.intf.GeneralServiceIntf;

import java.io.Serializable;
import java.util.List;

public class BookServiceImpl implements GeneralServiceIntf<Book, String> {

    private static BookDao bookDao;

    public BookServiceImpl() {
        bookDao = new BookDao();
    }

    @Override
    public void persist(Book entity) {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.persist(entity);
        bookDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public void update(Book entity) {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.update(entity);
        bookDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public Book findById(String id) {
        bookDao.openCurrentSession();
        Book book = bookDao.findById(id);
        bookDao.closeCurrentSession();
        return book;
    }

    @Override
    public List<Book> findAll() {
        bookDao.openCurrentSession();
        List<Book> books = bookDao.findAll();
        bookDao.closeCurrentSession();
        return books;
    }

    @Override
    public void deleteAll() {
        bookDao.openCurrentSessionwithTransaction();
        bookDao.deleteAll();
        bookDao.closeCurrentSessionwithTransaction();
    }

    public BookDao bookDao() {
        return bookDao;
    }

    @Override
    public void delete(Book entity) {
        bookDao.openCurrentSessionwithTransaction();
        Book book = bookDao.findById(entity.getId());
        bookDao.delete(book);
        bookDao.closeCurrentSessionwithTransaction();
    }

}
