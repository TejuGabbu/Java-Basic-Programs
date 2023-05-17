// program is to print a simple star triangle of n height
import java.util.Scanner;
public class patter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++)
        {
            int spaces = n - i;
            int stars = n - spaces; 
            int aspaces = n - i;
            for (int p = 1 ; p<=spaces ; p++)
            {
                System.out.print(" ");
            }
            for (int j = 1 ; j<= stars ; j++)
            {
                System.out.print(" *");
            }
            for (int k = 1 ; k<= aspaces ; k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}