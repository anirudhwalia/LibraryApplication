package com.example.LibraryMS.Util;


import com.example.LibraryMS.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle().equals(null))
            return false;
        return true;
    }
}
