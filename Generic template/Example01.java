class box<T>{
    private T item;
    public void setItem(T item){
        this.item= item;
    }
       return item;
    }
 
public class  Example01{
    public static void main(String[] args) {
        box<String> b1 = new box<String>();
        b1.setItem("Hello World");
        System.out.println(b1.getItem());

        box<Integer> b2 = new box<Integer>();
        b2.setItem(123);
        System.out.println(b2.getItem());

        box<Double> b3 = new box<Double>();
        b3.setItem(123.45);
        System.out.println(b3.getItem());
    }
}