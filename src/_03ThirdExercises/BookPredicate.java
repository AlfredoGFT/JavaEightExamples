package _03ThirdExercises;

import model.Book;
import util.BookAutoBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookPredicate {

    public void normalPredicates() {
        List<Book> books = BookAutoBuilder.buildMultipleBooks(BookAutoBuilder.THOUSAND, BookAutoBuilder.THOUSAND);

        Predicate<Book> startsWith = book -> book.getName().startsWith("H");
        Predicate<Book> isHarryAndVolumeOne = book -> book.getName().contains("Harry Potter") && book.getVolume() == 1;
        Predicate<Book> isNotNull = Objects::nonNull;
        Predicate<Book> isAnImpostor = book -> !book.getName().contains("Harry Potter");

        List<Book> result = books.stream().filter(startsWith).collect(Collectors.toList());
    }
}
