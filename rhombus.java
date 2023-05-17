import java.util.Scanner;
public class rhombus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ;i++)
        {
            int spaces = n - i;
            int numbers = n - spaces;
            int aspaces = n - i;
            for (int p = 1 ; p<=spaces ; p++)
            {
                System.out.print(" ");
            }
            for (int q = numbers ; q<=numbers ; q--)
            {
                if (q==0)
                {
                    break;
                }
                System.out.print(q);
            }
            for (int r = 2 ; r<=numbers ; r++)
            {
                System.out.print(r);
            }
            // for (int s = 1 ; s<=aspaces ; s++)
            // {
            //     System.out.print(" ");
            // }
            // System.out.println();
        }
    }
}