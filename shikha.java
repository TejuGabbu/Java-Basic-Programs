// program is to find the zero's in the factorial of number
import java.util.Scanner;
public class shikha
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a[] = new int[100000];
        int n = sc.nextInt();
        int fact = 1 ;
        for (int i = 1 ; i<=n ; i++)
        {
            fact = fact * i;
        }
        int m = fact;
        int j = 0;
        int count = 0 ;
        while(m!=0)
        {
            int p = m%10;
            while (m!=0)
            {
                a[j] = p;
                count++;
                break;
            }
            j++;
            m = m/10;
        }
        int fcount = 0;
        for (int k = 0 ; k<count ; k++)
        {
            if (a[k]==0)
            {
                fcount++;
            }
        }
        System.out.print(fcount);
    }
}