package swordToOffer._6_旋转数组的最小数字;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest1 {
    @Test
    public void test1() {
        Solution solution = new Solution() ;
        int [] array = {7,1,3,4,5,6};
        System.out.println(solution.minNumberInRotateArray(array));

    }
}