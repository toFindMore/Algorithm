package swordToOffer._24_二叉树中和为某一值的路径;

import java.util.ArrayList;

public class Solution {

    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public void helper(TreeNode node,int target,int sum,int level,ArrayList<Integer> path1) {
        ArrayList<Integer> path =(ArrayList<Integer>) path1.clone();
        path.add(node.val);
        if(node.left == null && node.right == null && sum+node.val == target) {
            res.add(path);
            return;
        }
        if(node.left != null) {
            helper(node.left,target,sum+node.val,level+1,path);
        }
        if(node.right != null) {
            helper(node.right,target,sum+node.val,level+1,path);
        }

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return res;
        ArrayList<Integer> path = new ArrayList<Integer>();
        helper(root,target,0,1,path);
        return res;
    }
}