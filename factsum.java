// sum of factors of a number
import java.util.Scanner;
public class factsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for ( int i =1 ; i<=a ; i++)
        {
            if (a%i==0)
            {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}