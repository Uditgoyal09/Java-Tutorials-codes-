
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample{
    public static void main(String[] args) {
        String data="hELLO THIS IS A TEST!";
        try(FileOutputStream obj= new FileOutputStream("output.text",true)){     //true will enable the append mode (print 2 times)
            obj.write(data.getBytes()); //convert string into byte and write
            System.out.println("Data written to file successfully.");
        }
        catch(IOException e){
            System.out.println("Write operation unsuccessfull");
            e.printStackTrace();
        }
    }
}