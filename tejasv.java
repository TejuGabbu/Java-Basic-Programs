import java.util.Scanner;
public class tejasv
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();              //      5
        int a[] = new int[n];
        int count = 0 ;                   // 8 12 15 19 20
        for (int i = 0 ;i< n;i++)
        {
            a[i]= sc.nextInt();
        }
        for (int i = 0 ; i<n ;i++ )
        {
          for (int p = 1 ; p <= a[i] ; p++)
            {
                if (a[i]%p == 0)       // 8 % 1
                {
                    count++;           // 1       
                }
            }
            if (count == 2)
            {
                System.out.println(a[i] + " is a prime number");
            }
            count = 0 ; 
        }
    }
}