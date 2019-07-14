package leetcode.ValidNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * " -90e3   " => true
 * " 1e" => false
 * "e3" => false
 * " 6e-1" => true
 * " 99e2.5 " => false
 * "53.5e93" => true
 * " --6 " => false
 * "-+3" => false
 * "95a54e53" => false
 */
public class Solution {

    public boolean isNumber(String s) {
        String regex = "^[\\s]*[-|+]?" +
                "(" +
                "([\\d]+(\\.[\\d]+)?)" +
                "|" +
                "([\\d]*(\\.[\\d]+))" +
                "|" +
                "([\\d]+(\\.[\\d]*))" +
                ")" +
                "(e[-|+]?[\\d]+)?" +
                "[\\s]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String dd;
//            dd.
        return matcher.find();
    }

}
