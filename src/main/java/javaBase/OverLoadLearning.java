package javaBase;

public class OverLoadLearning {

    public void test(String msg) {
        System.out.println("只有一个字符串的 test 方法");
    }

    public void test(String... books) {
        System.out.println("****形参长度可变的 test 方法****");
    }

    public static  void main(String[] args) {
        OverLoadLearning overLoadLearning = new OverLoadLearning();
        //****形参长度可变的 test 方法****
        overLoadLearning.test();
        overLoadLearning.test("aa","bb");
        overLoadLearning.test(new String[] {"aa"});
        //只有一个字符串的 test 方法
        overLoadLearning.test("hello");

    }
}
