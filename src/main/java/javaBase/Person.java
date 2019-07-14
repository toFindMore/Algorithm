package javaBase;

public class Person {
    // 引用类型的变量
    private final Name name;
    public Person(Name name) {
        this.name = new Name(name.getFirstName(),name.getLastName());
    }
    public Name getName() {
        //返回一个匿名对象，该对象的 firstName 和 lastName
        //与该对象中的 name 的 firstName 和 lastName 相同
        return new  Name(this.name.getFirstName(), this.name.getLastName());
    }
    public static void main(String[] args) {
        Name n = new Name("悟空","孙");
        Person p = new Person(n);
        // Person 对象的 name 的firstName 值为 “悟空”
        System.out.println(p.getName().getFirstName());
        //改变 Person 对象的 name 的 firstName 值
        n.setFirstName("🐷");
        System.out.println(p.getName().getFirstName());
    }
}
