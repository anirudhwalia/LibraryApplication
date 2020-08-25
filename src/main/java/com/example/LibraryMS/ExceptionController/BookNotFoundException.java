package com.example.LibraryMS.ExceptionController;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super("Book id not found : " + id);
    }
}
