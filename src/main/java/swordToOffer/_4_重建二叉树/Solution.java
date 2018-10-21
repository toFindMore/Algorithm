package swordToOffer._4_重建二叉树;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

    public void helper(TreeNode res,int [] pre,int [] in,int preStart,int preEnd,int inStart,int inEnd) {
        int cnt = inStart;
        for(int i=inStart;i<=inEnd;i++) {
            if(in[i] == pre[preStart]) {
                cnt = i;
                break;
            }
        }
        if(preStart+cnt-inStart >= preStart+1) {
            res.left = new TreeNode(pre[preStart+1]);
            helper(res.left,pre,in,preStart+1,preStart+cnt-inStart,inStart,cnt-1);
        }
        if(preEnd >= cnt-inStart+1+preStart) {
            res.right = new TreeNode(pre[cnt-inStart+1+preStart]);
            helper(res.right,pre,in,cnt-inStart+1+preStart,preEnd,cnt+1,inEnd);
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0)
            return null;
        TreeNode res = new TreeNode(pre[0]);
        helper(res, pre, in,0,pre.length-1,0,in.length-1);
        return res;
    }


    public static void main(String[] args) {
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        Solution solution = new Solution();
        System.out.println( solution.reConstructBinaryTree(pre,in) );
    }
}
