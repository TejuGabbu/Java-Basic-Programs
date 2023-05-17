import java.util.Scanner;
public class bill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=50)
        {
            int a = (50*5)-((50-n)*5);
            System.out.print(a);
        }
        else if (n>=51 && n<=150)
        {
            int a = (50*5)+(100*7)-((150-n)*7);
            System.out.print(a);
        }
        else if (n>=151 && n<=250)
        {
            int a = (50*5)+(100*7)+(100*9)+((250-n)*9);
            System.out.print(a);
        }
        else
        {
            int a = (50*5)+(100*7)+(100*9)+((n-250)*12);
            System.out.print(a);
        }
    }
}