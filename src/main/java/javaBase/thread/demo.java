package javaBase.thread;

public class demo {
    public static void main(String[] args) {
//        //创建线程实例
//        Mythread mythread = new Mythread();
//        //启动线程
//        mythread.start();
//
//        Mythread mythread1 = new Mythread();
//        mythread1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.setName("张三");
        thread1.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.setName("李四");
        thread2.start();

        Thread thread3 = new Thread(myRunnable);
        thread3.setName("王五");
        thread3.start();


    }
}
