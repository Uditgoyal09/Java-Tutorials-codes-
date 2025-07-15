// You are using Java
class rect1{
    private int l;
    private int b;
    public rect1(){     //creating a non permaterise constructor
        l=0;
        b=0;
        System.out.println(l);
        System.out.println(b);
    }
     public rect1(int l, int b){  //creating a permaterise constructor
        this.l=l;     //in case variable name is same then we use (this.) keyword {current obj] 
       this.b=b;
         System.out.println(l);
        System.out.println(b);
    }
    
   public  void area(){  //method of area
        int a =l*b;
        System.out.println("area of rect is "+a);
   }
    public static void main(String[] arg){
        rect1 obj1= new rect1();   //creating an obj for  non permaterise constructor 
        rect1 obj2= new rect1(5,5);  //creating an obj for permaterise constructor
        obj2.area();
    }
}