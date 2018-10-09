package sorting;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class InsertionTest {
    private int size;
    @Test
    public void sort() {
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        Insertion insertion = new Insertion();
        insertion.sort(a);
        System.out.println(insertion.isSorted(a));
    }
}
