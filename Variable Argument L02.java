// You are using Java
// You are using Java
import java.util.Scanner;
class Vargs2{
    public void Names(int a, String... n){
        for(String i:n){
            System.out.println(i);
        }
    }
    public static void main(String[] arg){
        Vargs2 v= new Vargs2();
        v.Names(1,"Udit");
        v.Names(1,"Udit","GOyal");
        v.Names(1,"Udit","Himanshu", "badal");
    }
}
    
    
