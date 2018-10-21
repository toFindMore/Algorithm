package javaBase;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class StaticLearningTest {
    @Test
    public void Test1(){
//        StaticLearning s1 = new StaticLearning();
//        System.out.println(StaticLearning.getCnt());
//        StaticLearning s2 = new StaticLearning();
//        System.out.println(s1.getCnt());//这种方法不提倡，因为 getCnt() 作为一个静态方法最好直接被类名调用
//        System.out.println(StaticLearning.getCnt());
//
//        String t1 = "hello";
//        String t2 = "hello";
//        String t3 = "hello!";
////        t3 = t3.replace("!","");
//        t3 = t3.substring(0,5);
//        System.out.println(t1 == t2);
//        System.out.println(t3 == t1);
//        System.out.println(t1.hashCode());
//        System.out.println(t2.hashCode());
//        System.out.println(t3.hashCode());

        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);

        PriorityQueue priorityQueue = new PriorityQueue(1000);
        PriorityQueue priorityQueue1  = new PriorityQueue();
        priorityQueue.add(10);
        priorityQueue.add(100);
        priorityQueue.add(19);
        priorityQueue.add(98);
        System.out.println( priorityQueue.peek() );
        System.out.println( priorityQueue.peek() );
        System.out.println( priorityQueue.peek() );
        System.out.println( priorityQueue.toArray() );

    }
}