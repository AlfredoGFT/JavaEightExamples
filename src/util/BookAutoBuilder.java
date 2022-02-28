package util;

import model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BookAutoBuilder {

    public static List<Book> buildMultipleBooks(Integer quantity, Integer maxValue) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            books.add(buildSingleBook(i, maxValue));
        }
        return books;
    }

    public static Book buildSingleBook(Integer volume, Integer maxValue){
        Book book = new Book(new Random().longs(0, maxValue).findFirst().getAsLong(), new Date(), null, false, "Harry Potter", null, volume, new ArrayList<>());
        return book;
    }
}
