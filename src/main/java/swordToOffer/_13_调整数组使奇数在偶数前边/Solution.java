package swordToOffer._13_调整数组使奇数在偶数前边;

public class Solution {
    public void reOrderArray(int [] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 == 1)
                count++;
        }

        int p = 0;
        int q = count;

        for (int i = 0; i < array.length; i++) {
//            if(array[i] == )
        }
    }
}
