public class ThrowExample{
    // public static void main(String[] arg){
    public static void checkEligibility(int age){
        if(age<18){
            throw new ArithmeticException("Access denied: Age must be 18 or above!");
        }
        System.out.println("You are eligible to vote");
    }
    public static void main(String[] arg){
            checkEligibility(15);
        // checkEligibility(20);
        System.out.println("End of program");
        
    }
}