package javaBase;

/**
 * static 属于类，不属于单个实例
 */
public class StaticLearning {
    private static int cnt ;
    public final int fianlV = 0;

    StaticLearning (){
        cnt ++;
    }

    public static int getCnt() {
        return cnt;
    }
}
