package javaBase.clone;

import java.util.ArrayList;

public class Demo {
    int demo;
    Person person;

    public Demo(int age,String name,int demo) {
        person = new Person();
        this.person.setAge(age);
        this.person.setName(name);
        this.demo = demo;
    }

    @Override
    public Demo clone() throws CloneNotSupportedException {
        Demo demo = (Demo)super.clone();
        return demo;
    }

    public static void main(String[] args)  {
//        Demo demo = new Demo(13,"LiLei",123);
//        Demo copy = demo.clone();
//        System.out.println(copy.person.getAge());
//        System.out.println(copy.person.getName());
//        System.out.println(copy.demo);
        double g = 1;
        for (int i = 0; i < 10; i++) {
            g *= 1.26;
        }
        System.out.println(g);

        ArrayList<Integer> arr = new ArrayList<>();




    }
}
