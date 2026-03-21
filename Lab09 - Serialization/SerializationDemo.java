import java.io.*;

// Create a class that implements Serializable
class Student implements Serializable {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display data
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            // Creating object
            Student s1 = new Student(101, "Aayush");

            // Serialization (Writing object to file)
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object serialized successfully.\n");

            // Deserialization (Reading object from file)
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Object deserialized successfully.\n");
            System.out.println("Student Details:");
            s2.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}