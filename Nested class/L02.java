class outerClass{
    static int outer_X= 10;
    int outer_y= 20;
    private int outer_private=30;

    class ABC{
        void display(){
            System.out.println("The value of X is "+ outer_X);
            System.out.println("The value of private is "+ outer_private);
            System.out.println("The value of y is "+ outer_y);   
        }
    }
} 

public class L02{
    public static void main(String [] arg){
        outerClass obj= new outerClass();
        outerClass.ABC obj1= obj.new ABC();  //important line
        obj1.display();
    }
}
  