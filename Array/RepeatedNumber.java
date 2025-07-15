// You are using Java

import java.util.Scanner;
class RepeatedNumber{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int []array= new int[a];  //initilize an arrray
        for(int i=0;i<a;i++){
            array[i]=s.nextInt();  //take input in array
        }
        
        boolean found=false;  //check found
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(array[i]==array[j]){ //check condition
                    count++;  //if fount or match then increment
                }
            }
            //conditon ---->>
            if(count>1){
                System.out.println(array[i]);
                System.out.println("Number repeate "+count+" times");
                found=true;
                break;  //exit
            }
        }  //for loop ends here
        
        if(!found){
            System.out.println("not found");
        }
    }
}