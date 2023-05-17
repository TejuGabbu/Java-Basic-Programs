// program is to check whether a number is automorphic or not
import java.util.Scanner;
public class auto
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100000];
        long b[] = new long[100000];
        int n = sc.nextInt();   // 890625
        int m = n ;    // temporary variable store kel
        int p = 0;
        int i = 0;
        int count = 0;
        while (n!=0)
        {
            p = n%10;
            count++;
            while (n!=0)
            {
                a[i] = p;   // 6    7
                i++;
                break;
            }
            n = n/10 ;
        }  
        long s =(long) m * m ; /// square done   // 5776
        long q = 0;
        int j = 0;
        while (s!=0)
        {
            q = s%10;
            while (s!=0)
            {
                b[j]= q;
                j++;    // count = 2
                break;
            }
            s = s/10;
        }   // 76      // 5776
        int fcount = 0;
        for (i = 0 ; i<count ; i++)
        {
            if (a[i] == b[i])
            {
                fcount++;
            }
        }
        if (fcount == count)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
    }
}