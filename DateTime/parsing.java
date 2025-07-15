import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class parsing{
    public static void main (String[] args){
        String str= "17-03-2025 12:30:45";
        DateTimeFormatter fd1= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ob1= LocalDateTime.parse(str, fd1);  //parse the string to LocalDateTime
        System.out.println("After Parsing: " + ob1);
    }
}
