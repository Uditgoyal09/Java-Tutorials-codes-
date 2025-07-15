// You are using Java
import java.util.Scanner;
class Array1{
    public static void main(String[] arg){
        Scanner obj= new Scanner(System.in);
            int a= obj.nextInt();  //size of array
            int []array = new int[a];  //initilizing the array
            for(int i=0;i<a;i++){    //taking input from user
                array[i]= obj.nextInt();
            }
            
            //print the array
            for(int i=0;i<a;i++){
                System.out.println(array[i]);
        }
    }

}