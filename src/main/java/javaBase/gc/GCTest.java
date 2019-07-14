package javaBase.gc;

public class GCTest {

    private static GCTest ft;

    public void info() {
        System.out.println("KK");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1; i++) {
            new GCTest();
            System.gc();
//            System.out.println("OK");
            Thread.sleep(2000);

            ft.info();

            // Runtime 条件下的 gc 方法
//            Runtime.getRuntime().gc();
//            // System 条件下的 gc 方法
//            System.gc();
        }
    }

    @Override
    protected void finalize() throws Throwable {
//        System.out.println("系统正在清理资源 ...");
        ft = this;
    }
}
