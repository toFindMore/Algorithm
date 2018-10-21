package swordToOffer._6_旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    private int res;
    public void helper(int [] array,int lo,int hi) {
        if(lo > hi) return;
        if( array[lo] < array[hi] ) { res = array[lo]; return;}
        int mid = (lo + hi)/2;
        if( mid-1 >=0 && array[mid]<array[mid-1] ) {
            res = array[mid];
            return ;
        }
        else if(mid == 0) { res = (array[0]>array[1]?array[1]:array[0]); return;}

        if( array[mid] > array[hi] ) {
            helper(array,mid+1,hi);
        }
        else {
            helper(array,lo,mid-1);
        }
    }
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        helper(array,0,array.length-1);
        return res;
    }
}
