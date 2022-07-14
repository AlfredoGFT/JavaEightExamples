package _03ThirdExercises;

import model.Author;
import model.Book;
import model.Genre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class BookOptional {

    public void getBooksException() {
        Book book = new Book("Normal", new HashSet<>(), 1, new ArrayList<>());
        Book nullBook = null;

        if (book.getAuthors() != null) {
            System.out.println("NOT NULL 1!");
        }

        if (nullBook.getAuthors() != null) {
            System.out.println("NOT NULL 2!");
        }
    }

    public void getBooksOptional() {
        Optional<Book> book = returnOptionalBook(false);
        Optional<Book> nullBook = returnOptionalBook(true);

        if (book.isPresent() && book.get().getAuthors() != null) {
            System.out.println("NOT NULL 1!");
        }

        if (nullBook.isPresent() &&  nullBook.get().getAuthors() != null) {
            System.out.println("NOT NULL 2!");
        }
    }

    private Optional<Book> returnOptionalBook(boolean empty) {
        if (empty) {
            return Optional.empty();
        }
        return Optional.of(new Book("Optional", new HashSet<>(), 2, new ArrayList<>()));
    }
}
