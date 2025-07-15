// public class ABC{
//     private final int x=10;
//     void display(){
//         class local{
//             void show(){
//                 System.out.println("The value of x is "+ x);
//             }
//         }
//         local obj= new local();
//         obj.show();
//     }
//     public static void main(String[] args) {
//         ABC obj1= new ABC();
//         obj1.display();
//     }
// }
public class ABC{
    private final int x=10;
    ABC(){
        class local{
            void show(){
                System.out.println("The value of x is "+ x);
            }
        }
        local obj= new local();
        obj.show();
    }
    public static void main(String[] args) {
        ABC obj1= new ABC();
        // obj1.ABC();
    }
}