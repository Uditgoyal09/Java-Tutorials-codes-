// You are using Java
import java.util.Scanner;

class BubbleSort{
    public static void main(String[] arg){
        Scanner obj= new Scanner(System.in);
            int n= obj.nextInt();
            int []arr1 = new int[n];  //initilizijg array

            //input from user
            for(int i=0;i<n;i++){
                arr1[i]= obj.nextInt();
            }   
            //Bubble sort algo!
            int counter= 1;
             while(counter<n-1){
                 for(int i=0;i<n-counter;i++){
                     if(arr1[i]>arr1[i+1]){
                         int temp= arr1[i];
                         arr1[i]=arr1[i+1];
                         arr1[i+1]= temp;
                     }
                 }
                 counter++;
             }
             //print elemnt of array
            for(int i=0;i<n;i++){
                System.out.println(arr1[i]);
        }
    }

}