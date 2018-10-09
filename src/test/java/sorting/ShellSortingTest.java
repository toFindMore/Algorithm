package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortingTest {

    private int size;
    @Test
    public void sort() {
        size = 500;
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        ShellSorting shellSorting = new ShellSorting();
        shellSorting.sort(a);
        System.out.println(shellSorting.isSorted(a));
    }
}