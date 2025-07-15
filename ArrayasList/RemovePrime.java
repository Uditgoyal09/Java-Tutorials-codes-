import java.util.*;

public class RemovePrime {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> nonPrimeNum = new ArrayList<>();

        for (int num : list) {
            if (!isPrime(num)) { // Add non-prime numbers to the list
                nonPrimeNum.add(num);
            }
        }

        System.out.println("Non-prime numbers: " + nonPrimeNum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}