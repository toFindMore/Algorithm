package javaBase;

public class MutibleParaFunction {
    public static void test(int a,String... books) {
        for(String book :books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] agrs) {
        test(10,"hello","bbbb","hsbs");
        test(10,new String[]{"Hello","ddd"});
    }
}
