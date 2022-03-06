package _02SecondExercises;

import util.BookAutoBuilder;

public class BookThread extends Thread {

    /* Actions */

    public void turnPages(long pages) {
        try {
            System.out.println("Turning pages at: " + this.getName());
            sleep(pages * BookAutoBuilder.THOUSAND);
            System.out.println("Finished turning pages at: " + this.getName());
            System.out.println("-------------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void readPages() {
        try {
            System.out.println("Reading at: " + this.getName());
            sleep(5L * BookAutoBuilder.THOUSAND);
            System.out.println("Finished reading at: " + this.getName());
            System.out.println("-------------------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
