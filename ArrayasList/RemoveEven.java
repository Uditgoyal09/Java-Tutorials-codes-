import java.util.*;
public class RemoveEven{
    public static void main(String[] arg){
                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> oddNum = new ArrayList<>();
        // for(int i = 0; i < list.size(); i++){
        //     if(list.get(i) % 2 != 0){
        //         oddNum.add(list.get(i));
        //     }
        // }
        // System.out.println("Odd numbers: " + oddNum);
    // }
    // or
    for(int num: list){
        if(num % 2 != 0){
            oddNum.add(num);
        }
    }
        System.out.println("Odd numbers: " + oddNum);
    }
    
    }
