import java.util.Scanner;
public class gs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int m = n;
        int spaces = 0;
        int stars = 0;
        int fstar = 0;
        for (int i = 1 ; i<=n ; i++)
        {
            spaces = m - 3;  // 5- 3 = 2
            stars = (m - stars) - 2 ;// (5 - 2) - 2 = 1
            fstar = (stars*2)-1; // ( 1*2 ) - 1 = 2 - 1 = 1
            for (int j = 0 ; j<spaces ; j++)   // spaces = 2  
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k<fstar ; k++)   // fstars= 1
            {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars++;                    
        }
    }
}