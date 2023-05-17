import java.util.Scanner;
public class sp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 7
        int a[] = new int[n]; // 1 2 3 4 2 3 2    a[0] = 1
        int b[] = new int[100000];
        for (int i = 0 ; i< n ;i++)   //            a[1] = 4
                                        //          a[2] = 6
        {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt(); // 2
       //  1 2 3 4 2 3 2
       int k = 0;
        for (int j = 0 ; j<n ; j++) //j == 1
        {
            while (d==a[j])  
            {
                b[k] = j;    // b[0] = 1 
                k++; // k=1;
                break;
            }
        }
        if (k>=1)
        {
        System.out.print(b[0]+" ");
        System.out.print(b[k-1]);
        }
        else
        {
            System.out.print("-1 -1");
        }
    }
}