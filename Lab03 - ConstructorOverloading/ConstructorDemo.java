class Student {

    String name;
    int age;

    // No-Argument Constructor
    Student() {
        name = "Aayush Chapagain";
        age = 22;
        System.out.println("No-Argument Constructor Called");
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor Called");
    }

    // Constructor Overloading
    Student(String n) {
        name = n;
        age = 0;
        System.out.println("Overloaded Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------------");
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized constructor
        Student s2 = new Student("Aayush Chapagain", 23);
        s2.display();

        // Constructor overloading
        Student s3 = new Student("Aayush Chapagain");
        s3.display();
    }
}