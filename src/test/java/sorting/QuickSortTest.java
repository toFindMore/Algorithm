package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    private  int size;
    @Test
    public void sort() {
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*10000);
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a);
        quickSort.show(a);
        System.out.println(quickSort.isSorted(a));
    }
}