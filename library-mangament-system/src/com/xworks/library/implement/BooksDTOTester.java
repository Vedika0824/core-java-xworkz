package com.xworks.library.implement;

import com.xworks.library.books.BookDTO;
import com.xworks.library.constant.BookType;
import lombok.ToString;

import java.util.Arrays;
import java.util.Scanner;
@ToString

public class BooksDTOTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The count of the books are: ");
        int size = sc.nextInt();

        PublicLibraryImpl lib = new PublicLibraryImpl(size);
        for(int index=0; index<lib.bookDTO.length; index++){

            BookDTO dto = new BookDTO();

            System.out.println("Enter Book's Name");
            dto.setBookName(sc.next());
            System.out.println("Enter Author's Name");
            dto.setAuthorName(sc.next());
            System.out.println("Enter publisher Name");
            dto.setPublisher(sc.next());
            System.out.println("Enter Year Of Publish ");
            dto.setYearOfPublish(sc.nextInt());
            System.out.println("Enter Number Of Pages ");
            dto.setNoOfPages(sc.nextInt());
            System.out.println("Enter Price");
            dto.setPrice(sc.nextDouble());
            System.out.println("Enter Book Type ");
            dto.setBookType(BookType.valueOf(sc.next()));

            lib.addBooks(dto);
        }
        lib.getAllBooks();

        String userInput = null;
        do {
            System.out.println("Press 1. To get all the books details");
            System.out.println("Press 2. To fetch books by id");
            System.out.println("Press 3. To fetch books by year");
            System.out.println("Press 4. To fetch books by author");
            System.out.println("Press 5. To fetch books by publisher");
            System.out.println("Press 6. To fetch book name by book type");
            System.out.println("Press 7. To fetch book price by book name");
            System.out.println("Press 8. To fetch book name by year of publish");
            System.out.println("Press 9. To delete book by book id");
            System.out.println("Press 10. To update book pages by book name");
            System.out.println("Press 11. To update book price by book id");
            System.out.println("Press 12. To update book publisher by book author");

            int options = sc.nextInt();
            switch (options){
                case 1:
                    lib.getAllBooks();
                    break;
                case 2:
                    System.out.println("fetching book name by id");
                    try {
                        System.out.println("Enter id");
                        BookDTO bookName = lib.getBooksById(sc.nextInt());
                        System.out.println(bookName);
                    }catch(BooksNotFoundException b){
                        b.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("fetching book name by year");
                    System.out.println("Enter Year: ");
                    BookDTO[] books = lib.getBookByYear(sc.nextInt());
                     System.out.println(Arrays.toString(books));

                    break;
                case 4:
                    System.out.println("Fetching books by author");
                    System.out.println("Enter author name");
                    BookDTO[] books1 = lib.getBooksByAuthor(sc.next());
                    System.out.println(Arrays.toString(books1));
                    break;
                case 5:
                    System.out.println("Fetching books by publisher");
                    System.out.println("Enter publisher");
                    BookDTO bookName1 = lib.getBooksByPublisher(sc.next());
                    System.out.println(bookName1);
                    break;
                case 6:
                    System.out.println("Fetching book name by book type");
                    System.out.println("Enter book Type: ");
                    String bookName2 = lib.getBookNameByBookType(BookType.valueOf(sc.next()));
                    System.out.println(bookName2);
                    break;
                case 7:
                    System.out.println("Fetching book price by book name");
                    System.out.println("Enter book name");
                    double price = lib.getBookPriceByBookName(sc.next());
                    System.out.println(price);
                    break;
                case 8:
                    System.out.println("Fetching book name by year of publish");
                    System.out.println("Enter publish year ");
                    String[] bookName3= lib.getBookNameByYearOfPublish(sc.nextInt());
                    System.out.println(Arrays.toString(bookName3));
                    break;
                case 9:
                    System.out.println("deleting book by book id");
                    System.out.println("Enter Book Id");
                    boolean isDeleted = lib.deleteBookById(sc.nextInt());
                    System.out.println(isDeleted);
                    lib.getAllBooks();
                    break;
                case 10:
                    System.out.println("updating book pages by book name");
                    System.out.println("Enter present book pages: ");
                    int pages = sc.nextInt();
                    System.out.println("Enter existing book name: ");
                    String name = sc.next();
                    boolean isPagesUpdated = lib.updateBookPagesByBookName(name, pages);
                    System.out.println(isPagesUpdated);
                    lib.getAllBooks();
                    break;
                case 11:
                    System.out.println("Updating book price by book id");
                    System.out.println("Enter present price");
                    double price1 = sc.nextDouble();
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    boolean isPriceUpdated = lib.updateBookPriceByBookId(id, price1);
                    System.out.println(isPriceUpdated);
                    lib.getAllBooks();
                    break;
                case 12:
                    System.out.println("Updating book publisher by book author");
                    System.out.println("Enter present publisher: ");
                    String publisher = sc.next();
                    System.out.println("Enter existing author name");
                    String author = sc.next();
                    boolean isPublisherUpdated = lib.updatePublisherByAuthor(author, publisher);
                    System.out.println(isPublisherUpdated);
                    lib.getAllBooks();
            }
            System.out.println("Do you want to continue YES/NO");
            userInput = sc.next();
        } while (userInput.equals("yes"));
        System.out.println("Thank You!! Visit Again..");
    }
}