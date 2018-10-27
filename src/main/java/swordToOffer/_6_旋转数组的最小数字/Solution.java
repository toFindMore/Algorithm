package swordToOffer._6_旋转数组的最小数字;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数
 * 组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

import java.util.ArrayList;
public class Solution {
    private int res;
    public void helper(int [] array,int lo,int hi) {
        if(lo > hi) return;
        if( array[lo] < array[hi] ) {
            res = array[lo];
            return;
        }
        int mid = (lo + hi)/2;
        if( mid-1 >=0 && array[mid]<array[mid-1] ) {
            res = array[mid];
            return ;
        }
        else if(mid == 0) {
            res = (array[0]>array[1]?array[1]:array[0]);
            return;
        }

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
