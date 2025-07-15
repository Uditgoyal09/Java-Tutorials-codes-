class Animal{}
class dog extends Animal{}
class Instanceof_lo1{
    public static void main(String[] arg){
        Animal a= new dog();
        if(a instanceof dog){
            System.out.println("yes a is a instance of dog");
            
        }
    }
}