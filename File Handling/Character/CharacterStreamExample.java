import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterStreamExample{   
    public static void main(String[] args) {
        try(FileReader fr= new FileReader("ip.txt");   //input file must exist in the same directoryg
            FileWriter fw= new FileWriter("op.txt")) {
            int data;
            while((data=fr.read())!=-1) {
                fw.write(data);
            }
            System.out.println("File copied successfully.");    
        } catch (IOException e) {
            System.out.println("Copy not Done.");
            e.printStackTrace();
        }
    }

}