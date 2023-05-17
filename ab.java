// program is to print the unique pattern triangle
import java.util.Scanner;
public class ab
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 4
        int spaces  = 0;
        int numbers = 0;
        int p = 0 ;
        int a = 0;
        for (int i = 1 ; i<=n ; i++)   // 1<=4
        {
            spaces = n - i ;   // 4 - 3 = 1
            numbers = n - spaces ; // 4 - 1 =  3
            p = numbers ;  // p = 3
            for (int j = 0 ; j<spaces ; j++) 
            {
                System.out.print(" "+" ");
            }
            for (int k = 0 ; k<numbers ; k++)   // 
            {
                System.out.print(p+" ");   //  3 4 5 
                p++;  // p = 6  
                // if (p>=10) 
                // {
                //     p = 1;                             
                // }  
            }
            a = p - 2 ;   // 6 - 2 = 4
            for (int s = 0 ; s<numbers-1 ; s++)   // 2
            {
                System.out.print(a+" ");   // 4 3
                a--; // 2 
            }
            System.out.println();
        }
    }
}