package _01FirstExercises.StreamsExercises;

import model.Book;
import util.BookAutoBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBooks {

    private static String FIRST_EDITION = " - FIRST EDITION!";

    public static void main(String[] args) {
        List<Book> book1K = BookAutoBuilder.buildMultipleBooks(10, 100);

        /* MAP */
        String allIds = "";
        allIds = book1K.stream()
                .map(book -> book.getId().toString())
                .collect(Collectors.joining(", "));
        System.out.println(allIds);
        System.out.println("\n");

        /* FILTER */
        long count9 = book1K.stream()
                .filter(book -> book.getId().toString().contains("9"))
                .count();
        System.out.println("Count of IDs with \"9\": " + count9);
        System.out.println("\n");

        /* SORTED */
        allIds = book1K.stream()
                .map(book -> book.getId().toString())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(allIds);
        System.out.println("\n");

        /* FOREACH and FOR */
        book1K.stream()
                .filter(book -> book.getVolume().toString().equals("1"))
                .forEach(book -> {
                    System.out.println(book.getName());
                    book.setName(book.getName() + FIRST_EDITION);
                    System.out.println(book.getName());
                });

        book1K.stream().filter(book -> book.getName().toString().contains(FIRST_EDITION))
                .forEach(book -> book.setName(book.getName().replace(FIRST_EDITION, "")));

        for (Book book : book1K) {
            if (book.getVolume() == 1) {
                System.out.println(book.getName());
                book.setName(book.getName() + FIRST_EDITION);
                System.out.println(book.getName());
            }
        }
    }
}
