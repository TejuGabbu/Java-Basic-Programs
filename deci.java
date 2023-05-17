// program is to print octal number into decimal
import java.util.Scanner;
public class deci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10000];
        int n = sc.nextInt();  // 527
        int count = 0 ;
        int p = 0;
        int i = 0;
        while (n!=0)
        {
            p = n%10;
            count++;
            while (n!=0)
            {
                a[i] = p;
                i++;
                break;
            }
            n = n/10;
        }
        int mul = 1;
        int s = 0 ;
        int sum = 0;
        int m = count-1;   // 2        527
        for (i = m ; i>=0 ; i--)   // 0 1 2   m = 2
        {
            if (i==0)
            {
                mul = 1 ;
            }
            else
            {
                for (int j = 1 ; j<=i ; j++)  //  1 2  m = 2
                {
                    mul = mul * 8 ;
                }
            }
            s = a[i] * mul;
            sum = sum + s ;
            mul = 1 ;
        }
        System.out.print(sum);
    }
}