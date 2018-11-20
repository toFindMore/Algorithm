package javaBase.runtime;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RuntimeTest {
    public static void main(String[] args) throws Exception{
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
        ThreadLocalRandom tr = ThreadLocalRandom.current();
        System.out.println( tr.nextInt() );
        Random rd = new Random(50);
        System.out.println(rd.nextBoolean());
        System.out.println(rd.nextInt());
        System.out.println(runtime.exec("sudo open /Users/ZJ/Applications/Chrome\\ Apps.localized/Default\\ fhbjgbiflinjbdggehcddcbncdddomop.app "));
    }
}
