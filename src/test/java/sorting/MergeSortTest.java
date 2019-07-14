package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    private int size;
    @Test
    public void sort() {
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*1000);
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a);
        mergeSort.show(a);
        System.out.println( mergeSort.isSorted(a) );;
    }
}