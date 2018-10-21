package swordToOffer._2_替换空格;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Solution {
    /**
     * 从尾巴那边开始移动，确保每一步都被移动到确定位置
     */
    public String replaceSpace(StringBuffer str) {
        if(str == null) return null;
        int cnt = 0;
        for(int i=0;i<str.length();++i)  {
            if(str.charAt(i) == ' ')
            {
                ++cnt;
            }
        }
        int p = str.length()+cnt*2-1;
        int oldLength = str.length() - 1;
        str.setLength(p+1);
        for (int i = oldLength; i >=0 ; i--) {
            if(str.charAt(i) == ' ')
            {
                str.setCharAt(p--,'0');
                str.setCharAt(p--,'2');
                str.setCharAt(p--,'%');
            }
            else
            {
                str.setCharAt(p--,str.charAt(i));
            }
        }
        return str.toString();
    }
}
