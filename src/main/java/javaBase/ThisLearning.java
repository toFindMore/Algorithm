package javaBase;

public class ThisLearning {
    public int age;
    static int a;

    public ThisLearning grow() {
        age++;
        return this;
    }

    public static void main(String[] args) {
        ThisLearning thisLearning = new ThisLearning();
        thisLearning.grow().grow().grow();
        System.out.println(thisLearning.age);// 3
        int t;
        {
            System.out.println(a);
        }
    }
}
