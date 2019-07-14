package leetcode.Valid_Palindrome_II;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public boolean validPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;
        boolean flag = false;
        while (p < q) {
            if (s.charAt(p) == s.charAt(q)) {
                ++p;
                --q;
            } else if (s.charAt(p) != s.charAt(q) && !flag) {
                ++p;
                flag = true;
            } else {
                break;
            }
        }
        if (p >= q) {
            return true;
        }
        p = 0;
        q = s.length() - 1;
        flag = false;
        while (p < q) {
            if (s.charAt(p) == s.charAt(q)) {
                ++p;
                --q;
            } else if (s.charAt(p) != s.charAt(q) && !flag) {
                --q;
                flag = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("abca"));
    }
}