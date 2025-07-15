import java.util.Scanner;

class repeated {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] array = new int[a];
        for(int i = 0; i < a; i++) {
            array[i] = s.nextInt();
        }

        for(int i = 0;i<a;i++) {
            int count = 0;
            for(int j = 0; j < a; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(array[i]);
                System.out.println("Number repeats " + count + " times");
                return;
            }
        }

        System.out.println("not found");
    }
}