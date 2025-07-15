// You are using Java
class Variable_Ex{
    
    static int c=0;      //static variable-> only one time it call (independent from obj)
     int b=0;           //instance variable --> value same for all
    
    public void counter(){
        int a= 10;   //a is a local variable (it exists only until the block is exist)
        c++;
        System.out.println("value of Local Variable is: "+ a);
        System.out.println("value of STATIC variable is: "+ c); //updated  value
        System.out.println("value of Instance variable is: "+ b); //updated  value
    }
    
    public static void main(String[] arg){
        Variable_Ex obj1= new Variable_Ex(); //create a 1st obj of a class 
        obj1.counter(); //calling the function from above
        
        Variable_Ex obj2= new Variable_Ex(); //create a  2nd obj  of a class 
        obj2.counter(); //calling the function from above
        
        Variable_Ex obj3= new Variable_Ex(); //create a 3rd obj of a class 
        obj3.counter(); //calling the function from above
        
    }
}