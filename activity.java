interface Shape{
    default void area(){                        
        System.out.println("finding area");
    }
}

class Circle implements Shape{
    public void area(){
        float r=5.0f;
        System.out.println("Area of Circle: "+(3.14*r*r));
    }
}

class activity{
    public static void main(String[] args){
        Circle c= new Circle();
        c.area();
    }
}