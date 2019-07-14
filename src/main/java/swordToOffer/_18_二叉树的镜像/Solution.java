package swordToOffer._18_二叉树的镜像;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class Solution {
    public void helper(TreeNode node) {
        if(node == null) return;
        TreeNode temp;
        temp = node.right;
        node.right = node.left;
        node.left = temp;
        helper(node.left);
        helper(node.right);
    }
    public void Mirror(TreeNode root) {
        helper(root);
    }
}
