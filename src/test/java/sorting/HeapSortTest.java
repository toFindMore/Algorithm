package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {
    int size;
    @Test
    public void test01() {
        HeapSort heapSort = new HeapSort();
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 1; i < size; i++) {
            a[i] = (int)(Math.random()*10000);
        }
        heapSort.sort(a);
        for(int i=1;i<a.length;++i)
            System.out.print(a[i] + " ");
    }
}