package javaBase.clone;

public class Person {
    int age;
    String name;

    public Person(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public Person() {

    }

    public int test() {
        return 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
