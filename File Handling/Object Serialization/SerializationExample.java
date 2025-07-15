// OBJECT SERIALIZATION – ---- SERIALIZABLE interface
// To convert Object to bytes or bits stream
import java.io.*;    // marker interface or empty interface
class Student implements Serializable {
    private static final long serialVersionUID = 12345678L;
    String name;
    int age;
    transient String password; // not serialized
    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }        
void display() {
System.out.println("Name: " + name + " , Age: " + age + " , Password: " + password);
}  }
public class SerializationExample {
    public static void main(String[] args) {
             Student student = new Student("Alice", 20, "secret123");
try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
           System.out.println("Object serialization failed");
        }
// PROCESS OF DESERIALIZATION BEGIN HERE….
        student = null; // Resetting the reference for demonstration purposes
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student ds = (Student) in.readObject();
            System.out.println("\nDeserialized Object:");
            ds.display();  // password will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}