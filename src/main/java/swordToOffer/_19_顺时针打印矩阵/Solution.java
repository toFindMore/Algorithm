package swordToOffer._19_顺时针打印矩阵;

import java.util.ArrayList;

/**
 *
 题目描述
 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 例如，如果输入如下4 X 4
 矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution {

    public void helper(int [][] matrix,ArrayList<Integer> res,int i,int x ,int y) {
        if(x <= 0 || y <= 0) return;
        //单列
        if(x == 1) {
            for(int k=0;k<y;k++) res.add(matrix[i+k][i]);
            return ;
        }
        //单行
        if(y == 1) {
            for(int k=0;k<x;k++) res.add(matrix[i][i+k]);
            return ;
        }
        for(int k=0;k<x;k++) { res.add(matrix[i][i+k]); }
        for(int k=1;k<y;k++) { res.add(matrix[i+k][i+x-1]); }
        for(int k=x-2;k>=0;k--) { res.add(matrix[i+y-1][i+k]); }
        for(int k=y-2;k>=1;k--) { res.add(matrix[i+k][i]); }
        helper(matrix,res,1+i,x-2,y-2);
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0) return null;
        helper(matrix,res,0,matrix[0].length,matrix.length);
        return res;
    }
}