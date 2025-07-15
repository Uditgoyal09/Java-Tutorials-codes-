import java.time.LocalDate;
import java.time.Period;
public class periodExample{
    public static void main(String[] args){
        LocalDate obj1= LocalDate.of(2023, 03, 17);
        LocalDate obj2= LocalDate.of(2025, 03, 17);
        Period p= Period.between(obj1, obj2);
        System.out.println("Period: " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days");

    }
}