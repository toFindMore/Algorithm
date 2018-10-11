package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBUSortTest {
    private int size;
    @Test
    public void test() {
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        MergeBUSort mergeBUSort = new MergeBUSort();
        mergeBUSort.sort(a);
        mergeBUSort.show(a);
        System.out.println(mergeBUSort.isSorted(a));
    }
}