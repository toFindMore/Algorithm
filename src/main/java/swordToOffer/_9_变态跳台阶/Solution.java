package swordToOffer._9_变态跳台阶;

/**
 * f(n) = f(1)+f(2)+...+f(n-1)
 *
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
    public int JumpFloorII(int target) {
        if( target == 0 ) return 1;
        if( target == 1 ) return 1;
        if( target == 2 ) return 2;
        int i = 2;
        int j = 2;
        for(int k=2;k<target;++k) {
            j = i+j;
            i = j;
        }
        return j;
    }
}
