// You are using Java
class Example2{
    public static void main(String[] arg){
        String Lit1="Thrusday!";    //method 1- using string literal 
        String s1= new String("Thrusday");  //method-2 -> using new keyword
        String Lit2="Thrusday!";    //method 1- using string literal 
        String s2= new String("Thrusday");  //method-2 -> using new keyword
        
        System.out.println("Comparing two strings "+ (s1==s2));  //(==) sign compare the memory location //output->false
        System.out.println("Comparing two strings "+ (Lit1==Lit2));     //in literal method ->it reuse the value form thr string pool  //output-> true
        
        System.out.println(s1.equals("Thrusday"));  //( equals) keyword compare content   //output-> true
    }
}
