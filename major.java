// program is to print the most frequent element
import java.util.Scanner;
public class major
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 7
        int a[] = new int[n];  // 1 2 6 5 2 1 1 ;
        int b[] = new int[n];  // count array
        int c[] = new int[n];  // main elements array
        int k = 0;
        int m = 0;
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<n ; j++)  // 1 2 6 5 2 1 1
            {
                if (a[i]==a[j])
                {
                    count++;   // 2
                }
            }
            while (k<n && count!=1)
            {
                b[k] = count; // count
                c[m] = a[i]; //  elements
                k++;
                m++;
                break;
            }
            count = 0;
        }
        // System.out.println();
        // for (int s = 0 ; s<k ; s++)
        // {
        //     System.out.println(c[s]+" "+b[s]);  // c- elements // b-count
        // }
        int great = b[0];
        int max = 0;
        for (int t = 1 ; t<k ; t++)
        {
            if (great<=b[t])
            {
                great = b[t];
                max = c[t]; // maximum element
            }
        }
        System.out.println(max);
    }
}