package _01FirstExercises.FunctionalInterfaceExercises;

import model.Book;

@FunctionalInterface
public interface GetBookFullName {

    public void getBookFullName(Book book);
}
