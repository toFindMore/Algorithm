package sorting;

public class Insertion extends SortingBlade {
    /**
     * 插入排序
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >=1 && less(a[j],a[j-1]) ; j--) {
                exch(a,j,j-1);
            }
        }
    }
}
