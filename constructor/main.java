// You are using Java
class main{
    float m1,m2,m3;
    
    void Average(){
        System.out.println("Student is absent ");
    }
    void Average(float m1, float m2){
        System.out.println("Average of student is: " + ((m1 +m2)/2));
    }
    void Average(float m1, float m2, float m3){
        System.out.println("Average of student is: " + ((m1 +m2 + m3)/3));
    }
    
    public static void main(String[] arg){
        main obj= new main();
        obj.Average();
        obj.Average(2.4f, 2.7f);   //by default compiler take value as a double to convert into float (__f)
        obj.Average(2.4f, 2.7f, 2.2f);
    }
}