// You are using Java

import java.util.Scanner;
class EvenPlaceNumber{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b=a;
        int sum=0;
        int count=-1;   //-----> pointing to index 0  //let position    //if count =0 then it check the odd place (pointing to index 1)
        
        while(b>0){
            int digit= b % 10;   //extrat last digit 
            count++;      //increase the position    //count ki vlaue index ko show kr rhi hai then after that imeditely check if condition
            if(count%2==0){ //check index %2 ==0(no at even place index)  
                sum=sum+digit;    //sum of number
            }
            b=b/10;   //remove last digit
        }
        System.out.print(sum);
        
    }
}