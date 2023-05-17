import java.util.Scanner;
public class sub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long a[] = new long[n];
        int count = 0;
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextLong(); 
        }
        // 4 5 0 -2 -3 1
        //5
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = i+1 ; j<n ; j++)
            {   
                sum = sum + a[i] + a[j]; // 
                
                // if ((a[i]+a[j])%k==0)
                // {
                //     count++;
                // }






            }
        }
    }
}