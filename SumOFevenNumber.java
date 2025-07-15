// You are using Java
//sum of number at even number 1234--- 6 ans
import java.util.*;
class SumOFevenNumber{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int sum=0;
        while(a>0){
            int digit= a%10;   //retrurn last digit(1234%10= 4)
            if(digit%2==0){        //check odd number  (digit%2!=0)
                sum= sum+digit;
            }
             a= a/10;  //remove last digit(1234 /10 == 123)
        }
        System.out.println(sum);
    }
}