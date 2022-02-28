package _01FirstExercises.ConsumersSuppliersExercises;

import model.Book;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSuppliers {

    public static void main(String[] args) {
        /* Creating the variables */
        Book book = new Book();
        Supplier<String> getNameSupplier = book::toString;
        Consumer<String> setNameConsumer = book::setName;
        BiConsumer<Book, Integer> setVolumeConsumer = Book::setVolume;

        book.setName("Harry Potter");
        System.out.println("First: " + getNameSupplier.get());

        setNameConsumer.accept("Hatty Potter FIRST EDITION!");
        System.out.println("Second: " + getNameSupplier.get());

        setVolumeConsumer.accept(book, 1);
        System.out.println("Third: " + getNameSupplier.get());
    }
}
