import java.util.Scanner;
public class last
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // 13
        int s[] = new int[2];
        long a = 1L;
        long b = 1L;
        long c = 0L;
        long i = 0L;
        if (n==1)
        {
            // System.out.print("1"+" ");
        }
        else if (n==2)
        {
            // System.out.print("1" + " ");
            // System.out.print("1" + " ");
        }
        else 
        {
            System.out.print("1" + " ");
            System.out.print("1" + " ");
            while (i<n-2)
            {
                c = a+b;
                System.out.print(c+" ");
                a = b ;
                b = c ;
                i++;
            }
            // long t = c ; // 270
            // int p = 0;
            // int f = 0;
            // long count = 0;
            // while (t!=0)
            // {
            //     p = (int)t%10;  
            //     while(t!=0)
            //     {
            //         s[f] = p;    //s[0] == 0
            //         count++;    // s[1] == 7
            //         break;
            //     }
            //     if (count==2)
            //     {
            //         break;
            //     }
            //     f++;
            //     t = t/10;
            // }
            // System.out.println();
            // System.out.print(s[1]);
            // System.out.print(s[0]);
        }
    }
}