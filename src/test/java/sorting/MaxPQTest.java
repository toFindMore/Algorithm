package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPQTest {
    @Test
    public void test1() {
        MaxPQ pq = new MaxPQ(1000);
        pq.insert(10);
        pq.insert(2);
        pq.insert(101);
        pq.insert(56);
        System.out.println(pq.getMax());
        System.out.println(pq.size());
        System.out.println(pq.delMax());
        System.out.println(pq.getMax());

    }
}