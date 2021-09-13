package com.dao;

import com.model.Book;

import java.util.ArrayList;

public class BookDAO {

    static ArrayList<Book> listBook = new ArrayList<>();
    Book book=new Book();
    public ArrayList<Book> returnList() {
        book.setBookName("computer");
        book.setBookAuthor("trivedi");
        book.setBookDetails("networks");
        book.setAuthorContact("8178");
        listBook.add(book);
        return listBook;
    }
}
