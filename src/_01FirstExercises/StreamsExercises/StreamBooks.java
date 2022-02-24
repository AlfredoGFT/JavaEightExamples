package _01FirstExercises.StreamsExercises;

import _01FirstExercises.FunctionalInterfaceExercises.GetBookFullName;

public class StreamBooks {

    public static void main(String[] args) {
        GetBookFullName getBookFullName = () -> "Testing";
        System.out.println(getBookFullName.getBookFullName());
    }
}
