package ZOJ._3936_Apples_and_Ideas;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- != 0) {
            int a,b,c,d;
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            System.out.println(c + " " + (b+d));
            System.out.println(a + " " + (b+d));
        }
    }
}

