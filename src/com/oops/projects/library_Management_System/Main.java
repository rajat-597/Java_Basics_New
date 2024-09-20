package com.oops.projects.library_Management_System;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Hc Verma");
        Author author2 = new Author("Shiv Khera");
        Author author3 = new Author("Sanjeev Sanyal");

        Book book1 = new Book("Physics" , author1);
        Book book2 = new Book("Motivational" , author2);
        Book book3 = new Book("Economics" , author3);

        System.out.println(book1.getAuthor());
        Library library =new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("list of book in the Library: ");
        System.out.println(library.listBook());

        String title = "Physics";
        Book foundBook = library.findBookByTitle(title);
        if(foundBook != null){
            System.out.println("Book With title " + title + " ");
            System.out.println(foundBook);
        }
        else {
            System.out.println("Book is not available in the library");
        }
    }
}
