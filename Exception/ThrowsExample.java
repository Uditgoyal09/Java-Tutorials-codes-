class ThrowsExample{
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
    public static void main(String[] args) {
        try {
            divide(10, 0); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        // finally {                                                      
        //     // This block always executes, regardless of whether an exception was thrown or caught.
        //     System.out.println("This block always executes.");
        // }
    }
}