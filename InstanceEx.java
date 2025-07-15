// You are using Java
class InstanceEx
{
    static int c=0;  //static variable
    int udit=5;  //instance Variable   (only assesed by all but using obj.___)
    public void counter(){
        int a= 10;   //a is a local variable (it exists only until the block is exist)
        c++;
        udit++;
        System.out.println("value of Local Variable is: "+ a);
        System.out.println("value of STATIC variable is: "+ c); //updated  value
        System.out.println("value of Instance variable is: "+ udit); //value is same for all obj who called
    }
    
    public static void main(String[] arg){
        System.out.println("!st object->");
        InstanceEx obj1= new InstanceEx(); //create a 1st obj of a class 
        obj1.counter(); //calling the function from above

        System.out.println("2nd object->");
        InstanceEx obj2= new InstanceEx(); //create a  2nd obj  of a class 
        obj2.counter(); //calling the function from above

        System.out.println("3rd object->");
        InstanceEx obj3= new InstanceEx(); //create a 3rd obj of a class 
        obj3.counter(); //calling the function from above

        System.out.println("4th object->");
         InstanceEx obj4= new InstanceEx(); //create a 4rd obj of a class 
       // obj4.counter(); //calling the function from above

        System.out.println("value of STATIC variable is: "+ c); //updated  value
       System.out.println("value of Instance variable is: "+ obj4.udit);  //here value of udit remains 5 because method for obj4 is not called
       // System.out.println("value of Local Variable is: "+ a);  //local varible can not call 

    }
}