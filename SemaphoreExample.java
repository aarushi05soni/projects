import java.util.Scanner;
import java.util.concurrent.Semaphore;

class OddEvenThreadRun implements Runnable {

    private final Semaphore semaphore;

    public OddEvenThreadRun(Semaphore s){
        this.semaphore = s;
    }

    public void run() {
        try {
            while (true) {
                semaphore.acquire();
                if(SemaphoreExample.counter > SemaphoreExample.no) {
                    semaphore.release();
                    break;
                }
                if ((Thread.currentThread().getName().equals("odd") && SemaphoreExample.counter % 2 == 1) ||
                        (Thread.currentThread().getName().equals("even") && SemaphoreExample.counter % 2 == 0)) {

                    System.out.println(Thread.currentThread().getName() + " " + SemaphoreExample.counter++);
                }
                semaphore.release();
            }
        } catch (Exception e) {

        }
    }

}

public class SemaphoreExample {
    static int counter = 1;
    static int no;

    static Semaphore semaphore = new Semaphore(1);

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        no = sc.nextInt();
        Thread t1 = new Thread(new OddEvenThreadRun(semaphore), "odd");
        Thread t2 = new Thread(new OddEvenThreadRun(semaphore), "even");
        //t1.start();
        t2.start();
        t1.start();
    }


}
