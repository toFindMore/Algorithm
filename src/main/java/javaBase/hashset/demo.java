package javaBase.hashset;

import java.util.HashSet;

/**
 * 根据两者的 hashCode() 的值定位到存储的位置，如果存在相同的值，则比较两者 equals() 是否相等，若相等，则添加；否则就链式挂住
 */


class A {


    @Override
    public int hashCode() {
        return 1;
    }
}

class B{

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}



public class demo {
    public static void main(String[] args) {
        HashSet v = new HashSet();
        v.add(new A());
        v.add(new A());
        v.add(new B());
        System.out.println(v);

    }
}
