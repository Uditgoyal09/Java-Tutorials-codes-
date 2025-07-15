import java.util.Scanner;
class practice2{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1= sc.nextLine();
      int n= sc.nextInt();
      sc.nextLine();
      String s2= sc.nextLine();

        //we cann't perform op on string 
        //it only applied on StringBuilder 
        //to perform oper we have to convert string to stringBuilder

        StringBuilder sb= new StringBuilder(s1);
        System.out.println(sb.insert(n,s2));
      }
}