package Adapter;

/**
 * Created by misko on 19.1.2015.
 */
public class Person implements Human {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void think() {
        System.out.println(name + " is " + age + " years old and he/she is human being who can think and create");
    }

    @Override
    public void feel() {
        System.out.println(name + " has feelings and emotions");
    }
}
