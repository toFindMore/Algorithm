package javaBase.arraylist_linkedarray;

import java.util.*;


public class demo {

    private static final int N = 500000;

    public static long calAddTime (List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long removeTime (List list){

        long start = System.currentTimeMillis();
        for (int i = 0; i < N/10; i++) {
            int x = (int)(Math.random()*N/10);
            list.remove(x);
        }
        return System.currentTimeMillis() - start;
    }

    public static long searchTime (List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < N/10; i++) {
            int x = (int)(Math.random()*N/10);
            list.get(x);
        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {

        LinkedList<Integer> lst = new LinkedList<Integer>();
        ArrayList<Integer> ast = new ArrayList<Integer>();

        System.out.println("_____________________________________________\n");

        System.out.println(" LinkedList 插入耗时（毫秒）：" + calAddTime(lst));
        System.out.println(" ArrayList  插入耗时（毫秒）：" + calAddTime(ast));

        System.out.println("_____________________________________________\n");

        System.out.println(" LinkedList 查询耗时（毫秒）：" + searchTime(lst));
        System.out.println(" ArrayList  查询耗时（毫秒）：" + searchTime(ast));

        System.out.println("_____________________________________________\n");

        System.out.println(" LinkedList 移除耗时（毫秒）：" + removeTime(lst));
        System.out.println(" ArrayList  移除耗时（毫秒）：" + removeTime(ast));

        System.out.println("_____________________________________________\n");

    }
}
