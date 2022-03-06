package _02SecondExercises;

public class MultiThreadExercises {

    public static void main(String[] args) {
        BookThread firstBookThread = new BookThread();
        BookThread secondBookThread = new BookThread();

        BookRunnable firstBookRunnable = new BookRunnable();
        BookRunnable secondBookRunnableSecond = new BookRunnable();

        firstBookThread.readPages();
        secondBookThread.readPages();

        firstBookRunnable.run();
        secondBookRunnableSecond.run();

        Thread firstThreadBookRunnable = new Thread(firstBookRunnable);
        Thread secondThreadBookRunnableSecond = new Thread(secondBookRunnableSecond);

        firstThreadBookRunnable.start();
        secondThreadBookRunnableSecond.start();
    }
}
