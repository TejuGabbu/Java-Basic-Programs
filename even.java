// printing even and odd numbers upto users input
import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 10 
        for (int i = 1 ;i <= n; i++)
        {
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1 ;i <= n; i++)
        {
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}