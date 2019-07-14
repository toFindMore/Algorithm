package javaBase;

public class Name {
    private String firstName;
    private String lastName;
    public Name(){}
    public Name(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // 省略 firstName、lastName 的 setter 和 getter 方法
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
