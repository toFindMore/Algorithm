package javaBase;

/**
 * static 属于类，不属于单个实例
 */
public class StaticLearning {
    private static int cnt ;

    StaticLearning (){
        cnt ++;
    }

    public static int getCnt() {
        return cnt;
    }
}
