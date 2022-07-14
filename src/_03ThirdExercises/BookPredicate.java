package _03ThirdExercises;

import model.Book;
import util.BookAutoBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookPredicate {

    public void normalPredicates() {
        List<Book> books = BookAutoBuilder.buildMultipleBooks(BookAutoBuilder.THOUSAND, BookAutoBuilder.THOUSAND);

        Predicate<Book> startsWith = book -> book.getName().startsWith("H");
        Predicate<Book> isHarryAndVolumeOne = book -> book.getName().contains("Harry Potter") && book.getVolume() == 1;
        Predicate<Book> isNotNull = Objects::nonNull;
        Predicate<Book> isAnImpostor = book -> !book.getName().contains("Harry Potter");

        Long qttStartH = books.stream().filter(startsWith).count();
        System.out.println("\nHow much Harries? " + qttStartH);

        Optional<Book> harryFirst = books.stream().filter(isHarryAndVolumeOne).findFirst();
        System.out.println("We have a first edition? " + harryFirst.isPresent());

        Long qttNotNull = books.stream().filter(isNotNull).count();
        System.out.println("How many not nulls? " + qttNotNull);

        Boolean haveImpostor = books.stream().anyMatch(isAnImpostor);
        System.out.println("Is there any impostor among us? " + haveImpostor);
    }
}
