// program is to print an arrow 
import java.util.Scanner;
public class alpha
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int spaces = (n/3) + 1;  // spaces = 2;
        int m = spaces; // m==2
        int stars = 0 ;
        int a = 1;
        for (int i = 1 ; i<= m ; i++)
        {
            for (int j = 0 ; j<spaces ; j++)
            {
                System.out.print(" "+" ");
            }
            for (int k = 0 ; k< a ; k++)
            {
                System.out.print("*"+" ");
            }
            a++;
            System.out.println();
        }
        int z = (a*2) - 1;
        for (int p = 1; p<=z ; p++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        for (int c = m ; c > 0 ; c--)  // 2  1
        {
            for (int t = 0 ; t<spaces ; t++)
            {
                System.out.print(" "+" ");
            }
            for (int s = 0 ; s< m ; s++)
            {
                System.out.print("*"+" ");
            }
            m--;
            System.out.println();
        }
    }
}
 // 8 