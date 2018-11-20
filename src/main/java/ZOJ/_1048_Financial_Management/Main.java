package ZOJ._1048_Financial_Management;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            double sum = 0;
            for (int i = 0; i < 12; i++) {
                sum += in.nextDouble();
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            //四舍五入
            double x = 0;
            if(sum*1000%10 >= 5) {
                x = 0.01;
            }
            System.out.println("$" + decimalFormat.format(sum/12+x) );
        }
    }
}
