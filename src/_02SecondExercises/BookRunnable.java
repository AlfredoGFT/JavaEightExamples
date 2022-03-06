package _02SecondExercises;

import util.BookAutoBuilder;

public class BookRunnable implements Runnable {

    /* Actions */

    public void turnPages(long pages) {
        try {
            System.out.println("Turning pages at: " + Thread.currentThread().getName());
            Thread.sleep(pages * BookAutoBuilder.THOUSAND);
            System.out.println("Finished turning pages at: " + Thread.currentThread().getName());
            System.out.println("-------------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void readPages() {
        try {
            System.out.println("Reading at: " + Thread.currentThread().getName());
            Thread.sleep(5L * BookAutoBuilder.THOUSAND);
            System.out.println("Finished reading at: " + Thread.currentThread().getName());
            System.out.println("-------------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        readPages();
    }
}
