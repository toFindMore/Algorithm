package javaBase;

public class Polymorphism {

    static class  BaseClass {
        public int book = 6;
        public void base() {
            System.out.println("父类普通方法");
        }
        public void test() {
            System.out.println("父类被覆盖的方法");
        }
    }

    public static class SubClass extends BaseClass {
        public String book = "OJBK";
        public void test() {
            System.out.println("子类覆盖父类的方法");
        }
        public void sub() {
            System.out.println("子类普通方法");
        }


    }

    public static void main(String [] args) {
        BaseClass baseClass = new SubClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test(); //多态性
        //baseClass.sub();//不合法
        System.out.println( ((SubClass) baseClass).book );
         ((SubClass) baseClass).sub();
    }

    /**
     * 6
     * 父类普通方法
     * 子类覆盖父类的方法
     * OJBK
     * 子类普通方法
     */
}

