package swordToOffer._23_二叉搜索树的后序遍历序列;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test01() {
        Solution solution = new Solution();
        int[] a = {1,2,3,4,2};
        System.out.println( solution.VerifySquenceOfBST(a) );

    }
}