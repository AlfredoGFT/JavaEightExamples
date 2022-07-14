package _03ThirdExercises;

public class OptionalPredicateExercises {

    public static void main(String[] args) {

        BookOptional bookOptional = new BookOptional();

        try {
            bookOptional.getBooksException();
            System.out.println("--Finished first--");
        } catch (NullPointerException e) {
            System.out.println("--YEP! NULL POINTER!--");
        }

        try {
            bookOptional.getBooksOptional();
            System.out.println("--Finished second--");
        } catch (NullPointerException e) {
            System.out.println("--NULL POINTER...?--");
        }
    }
}
