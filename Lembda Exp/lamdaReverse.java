interface StringOpr{
    String operate(String str1);
}
public class lamdaReverse{
    public static void main(String[] arg){
        StringOpr obj= (str)->new StringBuilder(str).reverse().toString(); // Lambda expression
        System.out.println("Reversed string is: " + obj.operate("Hello World"));
    }
}