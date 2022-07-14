package _03ThirdExercises;

import model.Author;
import model.Book;
import model.Genre;
import util.BookAutoBuilder;

import java.util.*;
import java.util.stream.Collectors;

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

    public void optionalPowers(boolean fullValues) {
        Optional<List<Book>> optionalBooks;
        if (fullValues) {
            optionalBooks = Optional.of(BookAutoBuilder.buildMultipleBooks(BookAutoBuilder.THOUSAND, BookAutoBuilder.THOUSAND));
        } else {
            optionalBooks = Optional.empty();
        }

        String names = optionalBooks.map(books -> books.stream().map(Book::getName).collect(Collectors.joining(" - ")))
                .orElse("Ops! How unfortunate!");
        System.out.println("Names: " + names);

        Integer totalVolumes = optionalBooks.map(books -> books.stream().map(Book::getVolume).reduce(0, Integer::sum))
                .orElseGet(() -> returnNotFoundCode());
        System.out.println("Total volumes: " + totalVolumes);

        String nameVolumes =  optionalBooks.map(books -> books.stream().map(book -> book.getName() + " " + book.getVolume()).collect(Collectors.joining(", ")))
                .orElseThrow(() -> new RuntimeException("Ops! How unfortunate!"));
        System.out.println("Name with volumes: " + nameVolumes);
    }

    private Integer returnNotFoundCode() {
        return 404;
    }
}
