package AkshayAssignment.Others;

import java.util.*;
import java.util.concurrent.Semaphore;

class ThreadEx extends Thread {
    Semaphore even, odd;
    int no;

    ThreadEx(int no, Semaphore even, Semaphore odd) {
        this.no = no;
        this.even = even;
        this.odd = odd;
    }

    public void run() {
        if(Thread.currentThread().getName().equals("even")) {
            try {
                for (int i = 1; i <=no; i+=2) {
                    even.acquire();
                    System.out.println("" + i);
                    odd.release();


                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        else
        {
            try {
                for (int i = 2; i <=no; i+=2) {
                    even.acquire();
                    System.out.println("" + i);
                    odd.release();


                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class Thread1 {
    public static void main(String args[]) {
        Semaphore even = new Semaphore(1);
        Semaphore odd = new Semaphore(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no = sc.nextInt();

        ThreadEx t1 = new ThreadEx(no, even, odd);
        ThreadEx t2 = new ThreadEx(no, odd, even);
        t1.setName("even");
        t2.setName("odd");
        t1.start();
        t2.start();
    }
}