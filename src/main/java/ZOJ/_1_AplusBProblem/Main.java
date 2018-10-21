package ZOJ._1_AplusBProblem;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1001
 * 注意下提交结构
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a,b;
        while (in.hasNextInt()) {
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
