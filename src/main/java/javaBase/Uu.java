package javaBase;

public interface Uu {
    // 接口里定义的成员变量只能是常量
    int MAX_CACHE_LINE = 50; // public static final 修饰

    // 接口里定义的普通方法只能是 public 的抽象方法  即普通方法
    void out();   // public abstract 修饰
    void getData(String msg);

    // 在接口中定义默认方法，需要使用 default 修饰
    default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }
    // 在接口中定义默认方法，需要使用 default 修饰
    default void test() {
        System.out.println("默认的 test() 方法");
    }

    // 在接口中定义类方法，需要使用 static 修饰
    static String staticTest() {
        return "接口中定义类方法";
    }
}