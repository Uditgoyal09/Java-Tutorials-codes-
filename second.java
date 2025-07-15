import java.util.Scanner;
class second {
    public static void main(String[] x) {
        Scanner obj = new Scanner(System.in);   //take input from the user
        System.out.println("Enter the value of a: ");
        int a = obj.nextInt();   //take input from user
        System.out.println("Enter the value of b: ");
        float b = obj.nextFloat();
        obj.nextLine(); // Consume the leftover newline character
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("Enter the value of c: ");
        int c = obj.nextInt();
        System.out.println("value of a is: " + a);
        System.out.println("your name is: " + name);
        double s1 = (a * b * c) / 100;
        System.out.println("The simple interest is " + String.format("%.2f", s1));
        System.out.printf("The simple interest is %.2f", s1);
        obj.close();
    }
}
