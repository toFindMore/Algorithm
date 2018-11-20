package javaBase.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        //Vector 的替代方案 ，线程安全的 ArrayList
        List<String> list = new ArrayList<>();
        List<String> sycList = Collections.synchronizedList(list);


    }
}
