
import java.util.Scanner;
class InputProgram{
	public static void main(String[] x){
	Scanner obj= new Scanner(System.in);  
	int a= obj.nextInt(); 
	obj.nextLine();  //consume 
	float b= obj.nextFloat();  
	String name= obj.nextLine();
	int c= obj.nextInt();
	double s1= (a*b*c)/100;
	System.out.println("your name is" + name);
	// System.out.println("The simple intrest is" + String.format("%.2f",s1)); 

	System.out.printf("The simple intrest is %.2f" ,s1); 
	long l=obj.nextLong();
	System.out.println(l);
	}

}