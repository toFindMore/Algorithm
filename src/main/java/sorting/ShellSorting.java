package sorting;

public class ShellSorting extends SortingBlade {
    /**
     * 增量的选取根据 Papernov & Stasevich 提出的 2^k + 1, 2^(k-1)+1... ,3,1 的形式
     * 结合插入排序，选取增量，最后增量为 1
     *
     */
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        // k 的最大值
        int k = (int) Math.floor( Math.log(len-1)/ Math.log(2.0) );
        for (int i = k; i >= -1; i--) {
            int step ;
            //确定增量
            if(i == -1) { step = 1;}
            else { step = (int) (Math.pow(2,i) + 1); }
            for (int j = step ; j < len; j++) {
                for (int l = j; l >= step && less(a[l],a[l-step]); l -= step) {
                    exch(a,l,l-step);
                }
            }
        }
    }
}
