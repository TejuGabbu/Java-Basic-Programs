program is to print diamont pattern of users input
import java.util.Scanner;
public class ad
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4   
        int m = n;
        int spaces = 0;
        int star = 0;
        int fstar = 0;
        for (int i = 1 ; i<=n ; i++) // 1 to 7
        {
            spaces = m-i;  // 4-2 = 2         
            star = m - spaces; // 4-2 = 2      
            fstar = (star * 2) - 1; // 4-1 = 3
            for (int j = 0 ; j<spaces ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k<fstar ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1 ; i>=1 ; i--) // n = 4    // 4 3 2
        {
            spaces = m-i;  // 4-3 = 1         
            star = m - spaces; // 4-1 = 3      
            fstar = (star * 2) - 1; // 6-1 = 5
            for (int j = 0 ; j<spaces ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k<fstar ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}