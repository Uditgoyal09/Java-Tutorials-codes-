class car_l01{
    String brand;
    int year;
    car_l01(String brand, int year){
        this.brand = brand;
        this.year = year;
    }


    //overriding tostring() method of object class
    public String toString(){
        return "car{Brand: " + brand + " Year: " + year+"}";
    }
}
    public class tostring_l01{
        public static void main(String[] args){
            car_l01 myCar = new car_l01("Ford", 2020);
            car_l01 myCar2 = new car_l01("Toyota", 2019);
            System.out.println(myCar.toString());   //toString() method is used to convert onject into string.
            System.out.println(myCar2.toString());
            System.out.println(myCar.hashCode());
            System.out.println(myCar.getClass());
            System.out.println(myCar.equals(myCar2)); //equals() method is used to compare two objects.
        }
    }
    