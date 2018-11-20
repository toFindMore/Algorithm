package javaBase;

public class RuntimeConstantOOM {

    public static void main(String[] args) {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        String str11 = "计算机软件";

        System.out.println(str11 == str1);


        System.out.println(str1.intern() == str1);


        String str2 = new StringBuilder("By").append("te").toString();
        System.out.println(str2.intern() == str2);
    }
}