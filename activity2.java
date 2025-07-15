interface Shape{                      //static method means it only method of Shape Interface
    static void area(){           //due to static keyword, it is not overriding the default method
        System.out.println("finding area");
    }
}

class Circle implements Shape{
    static void area(){      //static method means it onlu method of Circle class
        float r=5.0f;
        System.out.println("Area of Circle: "+(3.14*r*r));
     }
}

class activity2{
    public static void main(String[] args){
        Circle c= new Circle();
        Shape.area();
        c.area();
    }
}