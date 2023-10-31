package com.xworks.library.implement;


import com.xworks.library.books.BookDTO;
import com.xworks.library.constant.BookType;

import java.util.Arrays;

public class PublicLibraryImpl implements Library {

    public BookDTO bookDTO[];

    public PublicLibraryImpl(int size){
        bookDTO = new BookDTO[size];
    }

    int index;
    int id = 0;
    @Override
    public boolean addBooks(BookDTO dto) {
        boolean isAdded = false;

        if(dto != null){
            dto.setBookId(++id);
            this.bookDTO[index++] = dto;
            isAdded = true;
        }
        else{
            System.out.println("Book Details are not provided..");
        }
        return isAdded;
    }

    @Override
    public void getAllBooks() {
        System.out.println("The Number Of Books Available Are: ");
        for(int dtoIndex=0; dtoIndex<bookDTO.length; dtoIndex++){
            System.out.println(bookDTO[dtoIndex]);
        }

    }

    @Override
    public BookDTO getBooksById(int id) {
        BookDTO book = null;
        for(int index=0; index<bookDTO.length; index++) {
            if (bookDTO[index].getBookId() == id) {
                book = bookDTO[index];
            }
        }
        if(book==null){
            throw new BooksNotFoundException("Books not found");
        }
        return book;
    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublish) {
         BookDTO[] bookDTO1=null;
         int newIndex=0;
        for(int index=0; index<bookDTO.length; index++){
            if((bookDTO[index].getYearOfPublish() == yearOfPublish)){
                newIndex++;
            }
        }
        bookDTO1=new BookDTO[newIndex];
        newIndex=0;
        for(int index=0; index<bookDTO.length; index++) {
            if ((bookDTO[index].getYearOfPublish() == yearOfPublish)) {
                bookDTO1[newIndex++]=this.bookDTO[index];
            }
        }
        return bookDTO1;
    }
    @Override
    public BookDTO[] getBooksByAuthor(String author) {
        BookDTO[] bookDTO2 = null;
        int newIndex = 0;
        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index].getAuthorName().equals(author)) {
                newIndex++;
            }
        }
        bookDTO2 = new BookDTO[newIndex];
        newIndex = 0;
        for (int index = 0; index < bookDTO.length; index++) {
            if (bookDTO[index].getAuthorName().equals(author)) {
                bookDTO2[newIndex++] = this.bookDTO[index];

            }
        }
        return bookDTO2;
    }
    @Override
    public BookDTO getBooksByPublisher(String publisher) {
        BookDTO book1 = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getPublisher().equals(publisher)){
                book1 = bookDTO[index];
            }
        }
        return book1;
    }

    @Override
    public String getBookNameByBookType(BookType bookType) {
        String name = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookType().equals(bookType)){
                name = bookDTO[index].getBookName();
            }
        }
        return name;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookName().equals(bookName)){
                price = bookDTO[index].getPrice();
            }
        }
        return price;
    }

    @Override
    public String[] getBookNameByYearOfPublish(int year) {
        String[] bookName2 = null;
        int newIndex = 0;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getYearOfPublish()==year){
               newIndex++;
            }
        }
        bookName2 = new String[newIndex];
        newIndex = 0;
        for(int index=0; index<bookDTO.length; index++) {
            if (bookDTO[index].getYearOfPublish() == year) {
                bookName2[newIndex++] = String.valueOf(this.bookDTO[index]);
            }
        }
        return bookName2;
    }

    @Override
    public boolean deleteBookById(int id) {
        boolean isDeleted = false;
        int newIndex, oldIndex;
        for(oldIndex = 0, newIndex =0; oldIndex < bookDTO.length; oldIndex++){
            if(!(bookDTO[oldIndex].getBookId() == id)){
                bookDTO[newIndex++] = this.bookDTO[oldIndex];
                isDeleted = true;
            }
        }
        bookDTO = Arrays.copyOf(bookDTO, newIndex);
        return  isDeleted = true;

    }

    @Override
    public boolean updateBookPagesByBookName(String existingBook, int updatePages) {
        boolean isPagesUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookName().equals(existingBook)){
                bookDTO[index].setNoOfPages(updatePages);
                isPagesUpdated = true;
            }
        }
        return isPagesUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int id, double updatePrice) {
        boolean isPriceUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookId() == id){
                bookDTO[index].setPrice(updatePrice);
                isPriceUpdated = true;
            }
        }

        return isPriceUpdated;
    }

    @Override
    public boolean updatePublisherByAuthor(String existingAuthor, String updatePublisher) {
        boolean isPublisherUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getAuthorName().equals(existingAuthor)){
                bookDTO[index].setPublisher(updatePublisher);
                isPublisherUpdated = true;
            }
        }
        return isPublisherUpdated;
    }
}


