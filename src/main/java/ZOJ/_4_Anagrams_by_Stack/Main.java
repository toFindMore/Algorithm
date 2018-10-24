package ZOJ._4_Anagrams_by_Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1004
 */
public class Main {
    private static String str1;
    private static String str2;
    private static StringBuilder RES = new StringBuilder();


    public static void helper(Stack<Character> stackIn,int p, String res,
                              String s) {
        //栈克隆
        Stack<Character> stack = (Stack<Character>) stackIn.clone ();
        String string = new String(s);
        //减枝
        if(!string.equals(str2.substring(0,string.length()))) {
            return;
        }
        if(string.equals(str2) ) {
            RES.append(res);
            RES.append("\n");
            return ;
        }
        //弹入操作 递归
        if(p < str1.length()) {
            stack.push(str1.charAt(p));
            helper(stack,p+1,res+"i ",string);
            stack.pop();
        }
        //弹出 递归
        if(!stack.empty()) {
            helper(stack,p,res+"o ",s+stack.pop());
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            str1 = in.next();
            str2 = in.next();
            if(str1.length() != str2.length()) {
                System.out.println("[");
                System.out.println("]");
                continue;
            }
            RES.replace(0,RES.length(),"[\n");
            Stack<Character> stack = new Stack<Character>();
            helper(stack,0,"","");
            RES.replace(RES.length(),RES.length(),"]");
            System.out.println(RES);
        }
    }
}
/**INPUT
 * madam
 * adamm
 * bahama
 * bahama
 * long
 * short
 * eric
 * rice
 *
 * OUTPUT
 * [
 * i i i i o o o i o o
 * i i i i o o o o i o
 * i i o i o i o i o o
 * i i o i o i o o i o
 * ]
 * [
 * i o i i i o o i i o o o
 * i o i i i o o o i o i o
 * i o i o i o i i i o o o
 * i o i o i o i o i o i o
 * ]
 * [
 * ]
 * [
 * i i o i o i o o
 * ]
 */