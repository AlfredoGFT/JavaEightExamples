package _03ThirdExercises;

public class OptionalPredicateExercises {

    public static void main(String[] args) {

        BookOptional bookOptional = new BookOptional();

        try {
            System.out.println("\n--Start first--");
            bookOptional.getBooksException();
            System.out.println("--Finished first--");
        } catch (NullPointerException e) {
            System.out.println("--Null Pointer! First--");
        }

        try {
            System.out.println("\n--Start second--");
            bookOptional.getBooksOptional();
            System.out.println("--Finished second--");
        } catch (NullPointerException e) {
            System.out.println("--Null Pointer! Second--");
        }

        try {
            System.out.println("\n--Start third--");
            bookOptional.optionalPowers(true);
            System.out.println("--Finished third--");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("--Runtime Exception! Third--");
        }

        try {
            System.out.println("\n--Start fourth--");
            bookOptional.optionalPowers(false);
            System.out.println("--Finished fourth--");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("--Runtime Exception! Fourth--");
        }

        BookPredicate bookPredicate = new BookPredicate();

        bookPredicate.normalPredicates();
    }
}
