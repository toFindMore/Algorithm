package javaBase.thread;

public class MyRunnable implements Runnable{
    private int tickets = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while(true) {
//            synchronized (obj) {   // 同步：安全性高，效率低；非同步，效率高，安全性低。
//               method();
//            }

            method();
        }
    }

    private synchronized void method() {
        if(tickets >=1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(Thread.currentThread().getName() + ":" + tickets--);
        }
    }
}
