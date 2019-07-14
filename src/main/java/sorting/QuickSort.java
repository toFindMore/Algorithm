package sorting;

import java.util.*;

public class QuickSort extends SortingBlade {
    @Override
    public void sort(Comparable[] a) {
        shuffleArray(a);
        sort(a,0,a.length-1);
    }

    public void sort(Comparable[] a,int lo,int hi) {
        if(lo >= hi) return;
        int pos = partition(a,lo,hi);
        sort(a,lo,pos-1);//左半边递归
        sort(a,pos+1,hi);//右半边递归
    }

    //分片
    public int partition(Comparable[] a,int lo,int hi) {
        int i = lo,j = hi + 1;
        Comparable v = a[lo];
        while(true) {
            while(less(a[++i],v)) { if(i == hi) break;}
            while(less(v,a[--j])) { if(j == lo) break;}
            if(i >= j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    // 数组打乱
    public void shuffleArray(Comparable[] a) {
        int n = a.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int r = i + rand.nextInt(n-i);  // between i and n-1
            Comparable temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
