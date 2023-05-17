import java.util.Scanner;
public class diamond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dspaces = 0 ;
        int dstars = 0;
        int dfstars = 0; // 6
        for (int i = 1 ; i<=n ; i++)
        {
            int spaces = n - i;
            int stars = n - spaces;
            int fstars = (stars * 2) - 1; 
            for (int p = 1 ; p<=spaces ; p++)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j<=fstars ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
            for (int s = n - 1 ; s>=1 ; s-- )   //s= 5 4 3 2 1
            {
                dspaces = n - s ;   // 6 - 5  = 1
                dstars = n - dspaces; // 6 - 1 = 5 
                dfstars = (dstars * 2 )- 1 ; // 5 * 2 = 10 - 1 = 9
                for (int k = 0 ; k<dspaces ; k++)
                {
                    System.out.print(" ");
                }
                for (int t = 0 ; t<dfstars; t++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}