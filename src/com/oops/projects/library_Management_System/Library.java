package com.oops.projects.library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String listBook(){
        if(books.isEmpty()){
           return "library is empty, Please add the books ";
        }
        StringBuilder sb = new StringBuilder();
        for(Book book : books){
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    public Book findBookByTitle(String title){
        for(Book book : books){
           if(book.getTitle().equals(title)){
               return book;
           }
        }
        return null;
    }
}


