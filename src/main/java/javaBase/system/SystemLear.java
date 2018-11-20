package javaBase.system;

import java.util.Map;
import java.util.Properties;

public class SystemLear {

    public static void main(String[] args) {
        Map<String,String> env = System.getenv();
        for(String name : env.keySet()) {
            System.out.println(name + " : " + env.get(name) );
        }

        Properties props = System.getProperties();
        System.out.println(props);
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());


        System.out.println( System.identityHashCode(env) );
        System.out.println(env.hashCode());

        //如果 hashCode
        Person person = new Person();
        System.out.println(System.identityHashCode(person));
        System.out.println(person.hashCode());


    }
}
