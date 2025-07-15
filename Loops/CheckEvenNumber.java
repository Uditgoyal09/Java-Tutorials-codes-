// You are using Java
import java.util.Scanner;
class CheckEvenNumber{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int sum=0;
        
        while(a>0){  
            int digit= a%10;  //ectract the last digit(gives remainder)
            if(digit%2==0){   // check the even number        (to check odd number digit%2!=0)
                sum= sum+digit *digit;  //sum of sq of digit
            }
            a=a/10;          //remove thr last digit (1234/10=123)
        }
        System.out.println(sum);
    }
}