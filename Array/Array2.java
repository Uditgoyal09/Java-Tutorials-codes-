// You are using Java
// You are using Java
import java.util.Scanner;
class Array2{
    public static void main(String[] arg){
        Scanner obj= new Scanner(System.in);
            int a= obj.nextInt();  //input of sizze
            
            int []array = new int[a]; //initilize the array
            for(int i=0;i<a;i++)
                array[i]= obj.nextInt();  //take input from user

                               
            for(int i:array){               //using for each loop (syntax-> (int var= arrayname))
                System.out.printf(i+" ");  //print the element of array
            }
        }
    }
