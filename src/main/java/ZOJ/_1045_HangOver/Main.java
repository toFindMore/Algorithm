package ZOJ._1045_HangOver;

import java.util.Scanner;

public class Main {
    private static double MAXNUM = 5.20;
    private static int MAXSIZE = 1005;
    private static double[] reg = new double[MAXSIZE];
    private static int regL = 0;

    public static void cal() {
        reg[0] = 0;
        for(int i=2;reg[i-2]<=MAXNUM;++i) {
            reg[i-1] = reg[i-2] + 1.0/i;
            regL = i-1 ;
//            System.out.println(i-1 +" "+ reg[i-1]);
        }
    }

    public static int search(double x) {
        for(int i=1;i<=regL;++i) {
            if(x < reg[i]) {
                return i;
            }
        }
        return regL+1;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double f;
        cal();
        while ((f = in.nextDouble()) != 0.00) {
            System.out.println(search(f) + " card(s)");
        }
    }
}
