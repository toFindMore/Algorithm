package swordToOffer._17_树的子结构;

/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {
    private boolean isSame = false;
    //判断一棵树是否相等
    public boolean travel(TreeNode node1,TreeNode node2) {
        if(node2 == null) return true;
        if(node1 == null) return false;
        if(node1.val == node2.val && travel(node1.left,node2.left)
                && travel(node1.right,node2.right)) {
            return true;
        }
        return false;
    }

    public void helper(TreeNode node1,TreeNode root2) {
        //减枝
        if(isSame == true)
            return ;
        if(node1 == null || root2 == null) return ;
        if(travel(node1,root2) == true) {
            isSame = true;
            return ;
        }
        helper(node1.left, root2);
        helper(node1.right,root2);
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        helper(root1,root2);
        if(isSame) return true;
        return false;
    }
}
