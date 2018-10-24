package ZOJ._3_Crashing_Balloon;

import java.util.*;

/**
 * http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1003
 */

public class Main {
    private static boolean flagA,flagB;

    private static void helper(int a,int b,int p) {
        //如果找到了这样的组合 减枝
        if(flagB == true) return ;
        //合法组合被找到
        if(a == 1 && b == 1) {
            flagB = true;
            return;
        }
        if(a == 1) { flagA = true; } //A 可以被合法的表示

        //并非所有能整除的数都需要
        while( p > 1 ) {
            if (a % p == 0) {
                helper(a / p, b, p - 1);
            }
            if (b % p == 0) {
                helper(a, b / p, p - 1);
            }
            p--;
        }
    }

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            //a 为挑战者，b 为高分者
            if(a > b) { int t = a; a = b; b = t;}

            flagA = false;
            flagB = false;
            helper(a,b,100);

            if(flagA && !flagB) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
    }
}

/*

343 49
3599 610
62 36


49
610
62
*/
