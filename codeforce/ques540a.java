import  java.util.Scanner;
class ques540a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int intMove = 0;
        for(int i=0; i<n; i++)
        {
            int a=str1.charAt(i)-'0';
            int b=str2.charAt(i)-'0';
            int diff = Math.abs(a-b);
            if(diff>5)
            {
                intMove += 10-diff;
            }
            else
            {
                intMove += diff;
            }
            
        }
        System.out.println(intMove);
        sc.close();

    }
}