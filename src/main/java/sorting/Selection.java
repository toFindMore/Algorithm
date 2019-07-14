package sorting;

public class Selection extends SortingBlade{
    /**
     * 选择排序
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i+1; j < len; j++) {
                if( less(a[j],a[min]) ) min = j;
            }
            exch(a,min,i);
        }
    }
}
