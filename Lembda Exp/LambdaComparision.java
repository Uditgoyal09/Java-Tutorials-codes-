
import java.lang.reflect.Array;
import java.util.List;

public class LambdaComparision{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.sort((a, b) -> a.compareTo(b)); // Lambda expression for sorting
        System.out.println("Sorted names: " + names);
        // Using method reference for sorting
    }
}