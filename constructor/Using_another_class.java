// You are using Java
class rect{
    int l;
    int b;
    rect(){     //creating a non permaterise constructor
        l=0;
        b=0;
        System.out.println(l);
        System.out.println(b);
    }
    rect(int p, int q){  //creating a permaterise constructor
        l=p;
        b=q;
         System.out.println(l);
        System.out.println(b);
    }
    void area(){  //method of area
        int a =l*b;
        System.out.println("area of rect is "+a);
    }
}
class Using_another_class{
    public static void main(String[] arg){
        rect obj1= new rect();   //creating an obj for  non permaterise constructor 
        rect obj2= new rect(5,5);  //creating an obj for permaterise constructor
        obj2.area();
    }
}