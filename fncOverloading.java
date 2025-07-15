// You are using Java
class fncOverloading{
    int side;
    double radius;
    int alt;
    double base;
    double length;
    double breadth;
    
    fncOverloading(){   //constructor
        side=5;
        radius=2.5;
        alt=5;
        base=3.5;
        length=4;
        breadth=4;
    }
    
    void area(int side) {
        System.out.println("Square Area: " + (side * side));
    }

    void area(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }

    void area(int alt, double base) {
        System.out.println("Triangle Area: " + (0.5 * alt * base));
    }

    void area(double length, int breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
    
    public static void main(String[] arg){
        fncOverloading obj= new fncOverloading();
        obj.area(5);
        obj.area(2.5);
        obj.area(5, 3.5);
        obj.area(4.0, 4);
    }
    
}