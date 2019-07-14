package swordToOffer._23_二叉搜索树的后序遍历序列;

/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution {
    //最后一个数是前面数的分界线
    boolean flag = true;
    public void helper(int [] sequence,int lo,int hi) {
        if(flag == false) return ;
        System.out.println(lo+ " "+hi);
        if(lo >= hi) return ;
        int p = hi;
        for(int i=lo;i<=hi-1;i++) {
            if(sequence[i] > sequence[hi]) {
                p = i;
                break;
            }
        }
        for(int i=p;i<=hi-1;i++) {
            if(sequence[i] < sequence[hi]) {
                flag = false;
                return ;
            }
        }
        helper(sequence,lo,p-1);
        helper(sequence,p,hi-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        helper(sequence,0,sequence.length-1);
        return flag ;
    }
}