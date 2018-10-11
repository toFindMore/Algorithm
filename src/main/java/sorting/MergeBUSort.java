package sorting;

public class MergeBUSort extends SortingBlade {
    private Comparable[] aux;//辅助数组
    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        for (int step = 1; step < a.length; step = step+step) {
            System.out.println(step);
            for (int i = 0; i < a.length; i += 2*step) {
                merge( a,i,Math.min(a.length-1,step+i-1) ,Math.min(a.length-1,i+2*step-1) );
            }
        }
    }

    public void merge(Comparable[] a,int lo,int mid,int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int q = lo,p = mid+1;
        for (int i = lo; i <= hi; i++) {
            if(q > mid) { a[i] = aux[p++]; }
            else if(p > hi) { a[i] = aux[q++]; }
            else if(less(aux[q],aux[p])) { a[i] = aux[q++]; }
            else { a[i] = aux[p++]; }
        }
    }
}

