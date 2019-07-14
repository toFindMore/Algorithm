package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest {
    private int size;
    @Test
    public void sort() {
        size = 16;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*100);
        }
        Selection selection = new Selection();
        selection.sort(a);
        System.out.println(selection.isSorted(a));
    }
}
