package sorting;

/**
 * 堆排序
 * 目的：排序下标为 1-N 的数组
 * 步骤  第1步：建立最大堆，采取非叶节点下沉操作，只需要对 N/2 的元素进行操作即可
 *       第2步：取 a[1],和 a[N]交换，下沉 a[1] 即可
 */
public class HeapSort {
    private int N;
    public void sort(Comparable[] a) {
        N = a.length - 1;
        //构造最大堆
        for (int i = N/2; i >=1 ; i--) {
            sink(a,i);
        }
        while (N > 1) {
            exch(a,1,N--);
            sink(a,1);
        }
    }
    //下沉操作 在这里很关键
    private void sink(Comparable[] a,int i) {
        while(2*i <= N) {
            int j = 2 * i;
            if(j < N && less(a,j,j+1)) j++;
            if(!less(a,i,j)) break;
            exch(a,i,j);
            i = j;
        }
    }
    static boolean less(Comparable[] a,int i,int j) {
        return a[i].compareTo( a[j] ) < 0;
    }

    static void exch(Comparable[] a,int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
