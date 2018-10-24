package swordToOffer._7_非波那契数列;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution {
    public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int i = 0;
        int j = 1;
        for (int k=0;k<n-1;++k) {
            int t = j;
            j = i+j;
            i = t;
        }
        return j;
    }
}
