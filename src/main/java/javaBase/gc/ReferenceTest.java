package javaBase.gc;

import java.lang.ref.WeakReference;

public class ReferenceTest {
    public static void main(String[] args)  throws Exception{
        String str = new String("OKJB");

        WeakReference wk = new WeakReference(str);

        str = null;

        System.out.println(wk.get());

        System.gc();
        System.runFinalization();

        System.out.println(wk.get());
    }
}
