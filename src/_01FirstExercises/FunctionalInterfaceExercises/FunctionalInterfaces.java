package _01FirstExercises.FunctionalInterfaceExercises;

import model.Book;
import util.BookAutoBuilder;

import java.util.List;

public class FunctionalInterfaces {

    private static String FIRST_EDITION = " - FIRST EDITION!";

    public static void main(String[] args) {
        List<Book> book1K = BookAutoBuilder.buildMultipleBooks(5, 100);

        GetBookFullName getBookFullName = book -> System.out.println(book.toString());
        getBookFullName.getBookFullName(book1K.get(1));

        SetBookSpecialName setBookSpecialName = book -> {
            if (book.getVolume().toString().equals("1")) {
                book.setName(book.getName() + FIRST_EDITION);
            }
        };
        setBookSpecialName.setBookSpecialName(book1K.get(1));
        getBookFullName.getBookFullName(book1K.get(1));
    }
}
