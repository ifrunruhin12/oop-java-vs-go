public class ObjectExample {
    public static void main(String[] args) {
        // Creating an object of the class Person
        Person p1 = new Person();
        p1.name = "Ruhin";
        p1.age = 21;
        p1.sayHello();
    }
}

// This is a class
class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

