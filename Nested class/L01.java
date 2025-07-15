class outerClass{
    static int outer_X= 10;
    int outer_y= 20;
    private static int outer_private=30;

    static class ABC{
        void display(){
            System.out.println("The value of X is "+ outer_X);
            System.out.println("The value of private is "+ outer_private);
            //System.out.println("The value of y is "+ outer_y);   //show error  bwcoz ist is a non static it req obj
            outerClass obj= new outerClass();
            System.out.println("The value of y is "+ obj.outer_y);
        }
    }
}

public class L01{
    public static void main(String [] arg){
        outerClass.ABC obj1= new outerClass.ABC();
        
        obj1.display();
    }
}
