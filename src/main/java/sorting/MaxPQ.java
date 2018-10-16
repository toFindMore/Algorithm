package sorting;

/**
 * 优先队列的实现
 * @param <Key>
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN+1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key getMax() {
        if(N == 0) return null;
        return pq[1];
    }

    public Key delMax() {
        Key max = pq[1];
        exch(1,N--);
        pq[N+1] = null;//防止元素游离
        sink(1);
        return max;
    }

    //下层元素上浮操作
    private void swim(int k) {
        while(k > 1 && less(k/2,k)) {
            exch(k/2,k);
            k /= 2;
        }
    }

    //上层元素下沉操作
    private void sink(int k) {
        while(k*2 <= N) {
            int j = 2*k;
            if(j < N && less(j,j+1)) j++;
            if(less(j,k)) break;
            exch(j,k);
            k = j;
        }
    }

    public boolean less(int i,int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i,int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}
