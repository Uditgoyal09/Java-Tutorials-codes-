// You are using Javaclass
class Strings01{
    public static void main(String[] arg){
        String s1 ="   i love java  ";  //remove extra spaces  (only extreeme spaces or tab or next line)
        System.out.println(s1.trim());
        
        String replaced= s1.replace("love", "like");  //s1= s1.replace giving an error....
        System.out.println(replaced);
        
        //spliting 
        String str = "apple,kiwi,watermalon,mango,orange";
        String []fruits= str.split(",");  //creating an array to store the elements
        for(String i: fruits)
        System.out.println(i);
    }
}