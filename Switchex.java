import java.util.Scanner;
class Switchex{
	public static void main(String[] arg){
	Scanner s= new Scanner(System.in);
	
	int b= s.nextInt();
	int c= s.nextInt();
    System.out.print("write operator:");
	char op= s.next().charAt(0);

	switch(op){	
		case '+': System.out.println( b + c);
        break;
		case '-': System.out.println( b - c);
        break;
		case '*': System.out.println( b * c);
        break;
		case '/': System.out.println( b / c);
        break;
        default: System.out.print("Invalid input");

        }
    }
}