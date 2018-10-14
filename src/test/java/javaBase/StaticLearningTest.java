package javaBase;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticLearningTest {
    @Test
    public void Test1(){
        StaticLearning s1 = new StaticLearning();
        System.out.println(StaticLearning.getCnt());
        StaticLearning s2 = new StaticLearning();
        System.out.println(s1.getCnt());//这种方法不提倡，因为 getCnt() 作为一个静态方法最好直接被类名调用
        System.out.println(StaticLearning.getCnt());
    }
}