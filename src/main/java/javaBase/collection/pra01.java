package javaBase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class pra01 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("dd");
        c.add("dddd");

        // 遍历1
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }

        System.out.println("");

        //遍历2
        Iterator it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());  多了就会返回异常

        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
