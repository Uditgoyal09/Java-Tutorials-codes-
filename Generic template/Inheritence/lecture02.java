class parent{
    int num=100;                           //super= parent
    parent(){
        System.out.println("Parent Constructor");
    }
    void display(){
        System.out.println("Parent Display");
    }
}
class child extends parent{
    int num=200;
    child(){
        super();   //super() is used to call the parent class constructor
        System.out.println("Child Constructor");
    }
    void show(){
        super.display(); //super is used to call the parent class method
        System.out.println("Parent num: "+super.num); //super is used to refer the parent class variable
         System.out.println("child num: "+num); //this is used to refer the current class variable
    }
}
class lecture02{
    public static void main(String[] args){
        child obj=new child();
        obj.show();
    }
}


//note- filename should be same as the class which is public