package swordToOffer._10_矩形覆盖;

/**
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
//动态规划 f(n) = f(n-1)+f(n-2)
public class Solution {
    public int RectCover(int target) {
        if( target == 0 ) return 0;
        if( target == 1 ) return 1;
        if( target == 2 ) return 2;
        int i = 1;
        int j = 2;
        for(int k=2;k<target;++k) {
            int t = j;
            j = j+i;
            i = t;
        }
        return j;
    }
}