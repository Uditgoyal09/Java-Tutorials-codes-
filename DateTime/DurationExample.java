import java.time.Duration;
import java.time.LocalTime;
public class DurationExample {
    public static void main(String[] args) {
        LocalTime obj1 = LocalTime.of(12, 30, 45);
        LocalTime obj2 = LocalTime.of(9, 4, 30);
        Duration d = Duration.between(obj1, obj2);
        System.out.println("Duration: " + d.toHours() + " hours " + d.toMinutes() + " minutes " + d.toSeconds() + " seconds");
    }
}