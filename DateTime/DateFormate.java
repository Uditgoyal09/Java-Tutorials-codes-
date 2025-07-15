import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateFormate {
    public static void main(String[] args) {
        LocalDateTime ob1 = LocalDateTime.now();    //make a obj of class LocalDateTime
        System.out.println("Before Formatting: " + ob1);

        //cusotm date format
        DateTimeFormatter fd1= DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss a");
        System.out.println("After Formatting: " + ob1.format(fd1));    
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");
        System.out.println("After Formatting: " + ob1.format(format));

        DateTimeFormatter fd2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("After Formatting: " +ob1.format(fd2));
    }
}
 
