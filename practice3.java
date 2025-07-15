import java .util.*;
class practice3{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int count=0;

        while(a>0){
            int digit= a%10;
            if(digit%2==0){
                count++;
            }
            a=a/10;
        }
        if(count==0){
            System.out.println("no evem digit");
        }
        else if(count%2==0){
            System.out.println("yes it is a divisior of orginal number");
        }
        else{
            System.out.println("not a divisior");
        }
    }
}  