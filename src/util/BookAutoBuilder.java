package util;

import model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BookAutoBuilder {

    public List<Book> buildMultipleBooks(Integer quantity) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            books.add(buildSingleBook(i));
        }
        return books;
    }

    public Book buildSingleBook(Integer volume){
        Book book = new Book(new Random().longs(0, Integer.MAX_VALUE).findFirst().getAsLong(), new Date(), null, false, "Name", null, volume, new ArrayList<>());
        return book;
    }
}
