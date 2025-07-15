interface MathOperation {
    int operate(int a, int b);
}
public class L02 {
    public static void main(String[] args) { 
        MathOperation obj1 = (a, b) -> (a + b);
        MathOperation obj2 = (a, b) -> a - b; // No braces needed for single statement
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + obj1.operate(10, 5));
        System.out.println("Subtraction: " + obj2.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
        
    }
}