package javaBase;

public class AutoBoxingUnboxing implements Uu{
    public static int ff;
    public static void main(String[] agrs) {

        AutoBoxingUnboxing d = new AutoBoxingUnboxing();
        d.print("mm","dddd");
        //直接把一个基本类型变量赋给 Integer 对象
        Integer inObj = 5;
        //直接把一个 boolean 类型对象赋给一个 Object 类型对变量
        Object boolObj = true;
        //直接把一个 Integer 对象赋值给 int 类型的变量
        int it = inObj;
        if(boolObj instanceof Boolean) {
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
        String inStr = "123";

        int it1 = Integer.parseInt(inStr);
        int it2 = new Integer(inStr);

        String ftStr = String.valueOf(2.334f);
        System.out.println(ftStr);

        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

        Integer biga = 128;
        Integer bigb = 128;
        System.out.println(biga == bigb);// false
        System.out.println( biga.compareTo(bigb));

        Integer bigc = 2;
        Integer bigd = 2;
        System.out.println(bigc == bigd);// true

        System.out.println(AutoBoxingUnboxing.class);
        AutoBoxingUnboxing autoBoxingUnboxing = new AutoBoxingUnboxing();
        autoBoxingUnboxing = null;
        System.out.println(autoBoxingUnboxing.ff);

        System.out.println(Uu.staticTest());
    }

    public void out(){}   // public abstract 修饰
    public void getData(String msg){};

}
