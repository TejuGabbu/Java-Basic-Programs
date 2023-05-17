import java.util.Scanner;
public class pattern                             
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); ///   6
        int i = 1 ;
        
        for (; i<=n ; i++)
        {
            int space = n - i;
            int hashes = n - space ;
            for (int j = 1 ; j<=space ; j++)  
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k<= hashes ;k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}