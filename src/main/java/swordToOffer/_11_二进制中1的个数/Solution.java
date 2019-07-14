package swordToOffer._11_二进制中1的个数;

import java.util.Arrays;

/**
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {
    public int NumberOf1(int n) {
        if(n == -2147483648) return 1;
        int t= n,count = 0,g = -1;
        int [] arr = new int[32];
        Arrays.fill(arr,0);
        t = Math.abs(n);
        while(t != 0) {
            arr[++g] = t%2;
            if(arr[g] == 1)
                count++;
            t /= 2;
        }
        //正数
        if(n >= 0) return count;
        //负数
        //反码
        for (int i = 0; i < 32; i++) {
            if(arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        int plusPush = 1;
        for (int i = 0; i < 31; i++) {
            if(arr[i]+plusPush == 2) {
                arr[i] = 0;
            }
            else break;
        }
        count = 1;
        for (int i = 0; i < 32; i++) {
            if(arr[i] == 1)
                count++;
        }
        return count;
    }
}
