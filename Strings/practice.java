class practice {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Rainy");
        System.out.println(sb.append(" Weather"));  //Rainy weather
        System.out.println(sb.insert(0, "Beautiful"));  //beautifulRainy Weather
        System.out.println(sb.delete(0, 5));
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 5, "Rainy"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        System.out.println(sb.indexOf("y"));
        System.out.println(sb.lastIndexOf("y"));
        System.out.println(sb.substring(0, 5));
        
        // Print unique characters of the string
        String s = sb.toString();
        StringBuilder S3 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                S3.append(c);
            }
        }
        System.out.println("Unique characters: " + S3.toString());

        // Remove duplicate characters
        StringBuilder S4 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (S4.indexOf(String.valueOf(c)) == -1) {
                S4.append(c);
            }
        }
        System.out.println("String without duplicates: " + S4.toString());
        
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.equals("Rainy Weather"));
    }
}
import java.util.Scanner;
class practice{
    public static void main(String[] x){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();

        // String s3= s1+s2;
   
        StringBuilder sb= new StringBuilder(s1);
        StringBuilder sb2= new StringBuilder(s2);
        // StringBuilder s4=sb.append(s2);
        for(int i=0;i<s1.length();i++){
            for(int j=0;j< s2.length();j++ ){
                if(s1.charAt(i)==s2.charAt(j)){
                    
                }
                System.out.println(j);
            }

        
    }
}
