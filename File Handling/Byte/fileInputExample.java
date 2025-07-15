import java.io.FileInputStream;   //class of byte code
import java.io.IOException;

public class fileInputExample{
    public static void main(String[] areg){
        try(FileInputStream obj= new FileInputStream("input.txt")){ //try with resources (class obj=new class("file.txt"))
            int content;
            while((content=obj.read())!=-1){  //read return integer value3
                System.out.print((char)content); //print on screen   //print (-) and number differenty of exist in the text file
            }
        }
        catch (IOException e){
            System.out.println("Read operation unsuccessful");
            e.printStackTrace();
        }
    }
}