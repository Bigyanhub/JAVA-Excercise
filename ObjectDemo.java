package Excercise;
class Student {
    String name;
    int age;

    void displatInfo() {
        System.out.println("Name:" + name + ", Age: " + age);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.displatInfo();

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.displatInfo();

    }
}
