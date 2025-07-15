import java.util.Scanner;
class vowelCount {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int vowelCount = 0;
        int constCount = 0;

        s1 = s1.toLowerCase();
        StringBuilder sb = new StringBuilder(s1);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    constCount++;
                }
            }
        }
        System.err.println("Number of vowels: " + vowelCount);
        System.err.println("Number of consonants: " + constCount);
    }
}


ques-> Ansh is a good programmer who enjoys to solve coding problem. his current task to count the number of vowel and consonants in a given string.
Create a program to count the number of vowel and number of consonants from a text or string provided by the user. using StringBuilder class for efficency of string manupulation.

// Input format-->
input consist a string representing a text by the user.

// output format->
the first line of output print the number of vowel followed by the number of vowel found in the String.

the second line of output print the number of consonants followed by the number of consonants found in the string.

INPUT->                                         Output->
Hey Programming is found                        NUmber of Vowel: 6
