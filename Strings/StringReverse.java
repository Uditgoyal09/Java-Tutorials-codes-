// You are using Javaclass
class StringReverse{
//     public static void main(String[] arg){
//        String str = "hello world";

//        //imp------>>
//        String []sp =str.split(" ");   //to store individual element in array

//        //imp----->
//        StringBuilder sb= new StringBuilder(sp[0]);  //to make change in string we have to create stringbuilder class which is mutable

//         //imp----->   
//        sb.reverse();  //reverse the sb string (that store elemt at 0 index of sp)

//        //imp--->
//        sb.append("u "+sp[1]);  //Appenda
    
//         //imp------->
//        System.out.println(sb);  //olleh world

    //    public class SplitExample {
    public static void main(String[] args) {
        String s = "Hello World This is Java";
        String[] sp = s.split(" ");

        for (String a : sp) {
            System.out.println(a);
        }
    }
}
