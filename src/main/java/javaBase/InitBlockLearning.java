package javaBase;

public class InitBlockLearning {
    {
        b = 100;
    }
    public int a = 10;
    public int b = 10;
    public int c = 10;
    {
        a = 100;
        c = 100;
    }
    public InitBlockLearning() {
        c = 1000;
    }
    public static void main(String[] args) {
        InitBlockLearning initBlockLearning = new InitBlockLearning();
        System.out.println(initBlockLearning.a);
        System.out.println(initBlockLearning.b);
        System.out.println(initBlockLearning.c);
    }

}
