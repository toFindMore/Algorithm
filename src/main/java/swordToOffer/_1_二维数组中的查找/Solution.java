package swordToOffer._1_二维数组中的查找;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * 整数，判断数组中是否含有该整数。
 */

public class Solution {
    /**
     * 从右上开始扫描
     */
    public boolean Find(int target, int [][] array) {

        int rr = array[0].length-1;
        int ll = array.length-1;
        int i = rr;
        int j = 0;
        while(j<=ll && i>=0) {
            if(array[j][i] == target)
                return true;
            else if(array[j][i] < target) {
                ++j;
            }
            else {
                --i;
            }
        }
        return false;
    }
}
