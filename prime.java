//prime or not 
import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 10
        int count = 0;
        int b = 0;
        for (int i = 1 ; i<=a ; i++)
        {
            b = i;
            for (int j = 1 ; j<=b ; j++ )
            {
                if (b%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.print(b+" ");
            }
            count = 0;
        }
        
    }
}