package javaBase.Enum;

public class EnumTest {
    public void judge(SeasonEnum s) {
        switch (s) {
            case SPRING:
                System.out.println("春暖花开。真好踏青");
                break;
            case SUMMER:
                System.out.println("夏日炎炎，适合游泳");
                break;
            case FALL:
                System.out.println("秋高气爽，进补及时");
                break;
            case WINTER:
                System.out.println("冬日雪飘，围炉赏雪");
        }

    }

    {
        System.out.println("我代码块先");
    }

    public static void main(String[] args) {
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s);
        }


        new EnumTest().judge(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.FALL.compareTo(SeasonEnum.SPRING));
        System.out.println(SeasonEnum.FALL.ordinal());
        System.out.println(SeasonEnum.SPRING.ordinal());



    }
}
