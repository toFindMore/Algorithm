package leetcode.Check_If_Word_Is_Valid_After_Substitutions;

public class Solution {
    public boolean isValid(String S) {
        String[] abcs = S.split("abc");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : abcs) {
            stringBuilder.append(s);
        }
        if (abcs.length == 0)
            return true;
        if (stringBuilder.toString().equals(S))
            return false;
        return isValid(stringBuilder.toString());
    }

    public static void main(String[] args) {
        String s = "afaabcbcbc";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}
