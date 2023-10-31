package com.xworks.library.implement;

public class BooksNotFoundException extends RuntimeException{
    public BooksNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
