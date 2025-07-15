import java.util.ArrayList;
import java.util.Collections;
public class SortExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("peacock");
        list.add("orange");
        list.add("kiwi");
        list.add("grape");
         list.add("peach");
        list.add("pear");
            
       
         Collections.sort(list); // Sort the list in ascending order
        // Print the original list
        System.out.println("Original list: " + list);    // Sort the list in ascending order
        Collections.sort(list);      // Print the sorted list
        System.out.println("Sorted list (ascending): " + list);      // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());       // Print the sorted list in descending order
        System.out.println("Sorted list (descending): " + list);
    }
}
