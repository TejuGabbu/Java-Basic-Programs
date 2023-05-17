//factors of a number and counting of factors
import java.util.Scanner;
public class factors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //10
        int count = 0;
        for (int i = 1 ; i<=a ; i++)
        {
            if (a%i==0)
            {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}