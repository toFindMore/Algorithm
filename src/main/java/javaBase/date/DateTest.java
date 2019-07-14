package javaBase.date;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis()+ 10000);
        System.out.println(date1.compareTo(date));

        System.out.println(date1.after(date));
        System.out.println(date);

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println( calendar.getTimeZone() );


        Calendar c1 = Calendar.getInstance();
        c1.set(2003,7,23,0,0,0);
        c1.add(Calendar.MONTH,2);
        System.out.println(c1);
//        date.after("2017-10-08 12:30:34");


        //线程安全
        Hashtable hashtable = new Hashtable();
        //hashtable 的替代者
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();


        //适配器模式
        Integer[] arr = {1,2,3};
        List<Integer> list = Arrays.asList(arr);
        for(Integer a : list) {
            System.out.println(a);
        }
    }
}
