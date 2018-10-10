package sorting;

public class MergeSort extends SortingBlade{
    /**
     * 归并排序，建立辅助数组，递归
     */
    private static Comparable[] aux;//辅助数组
    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    public static void sort(Comparable[] a,int lo,int hi) {
        if(lo >= hi) return;
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid); //左半边排序
        sort(a,mid+1,hi); //右半边排序
        merge(a,lo,mid,hi); //归并
    }

    // 归并排序
    public static void merge(Comparable[] a,int lo,int mid,int hi) {
        //辅助数组
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int q = lo,p = mid+1;
        for (int i = lo; i <= hi ; i++) {
            if (q > mid) a[i] = aux[p++]; //左半边已满
            else if(p > hi) a[i] = aux[q++]; //右半边已满
            else if( less(aux[q],aux[p]) ) a[i] = aux[q++]; //比较头部大小
            else a[i] = aux[p++];
        }
    }


}
