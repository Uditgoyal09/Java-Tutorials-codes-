// You are using Java
import java.util.*;
class mergedArray{
    public static void main(String[] x){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int []array1= new int[m];
        for(int i=0;i<m;i++){
            array1[i]=sc.nextInt();
        }
        
        int []array2= new int[n+m];
        for(int i=0;i<n;i++){
                array2[i]=array[i];
            }
            
        for(int i=0;i<m;i++){
            array2[n+i]=array1[i];
        }
        
        for(int i=0;i<n+m;i++){
            System.out.println(array2[i]);
        }
        
    }
}