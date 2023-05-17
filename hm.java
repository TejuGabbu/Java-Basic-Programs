import java.util.Scanner;
public class hm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 6
        int a[] = new int[n];
        int b[] = new int[10000];
        int c[] = new int[10000];
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int count = 0 ; // 1 7 1 4 4 1
        int k = 0 ;
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<n ; j++)
            {
                if (a[i]==a[j])
                {
                    count++;
                }
            }
            while(count!=1)
            {
                b[k] = count;  // count    
                c[k] = a[i];   // element
                k++;
                break;
            }
            count = 0 ;
        }
        int greatest = b[0];
        int heightest = 0;
        for (int i = 1 ; i<k ; i++)
        {
            if (greatest<=b[i])
            {
                greatest = b[i];
                heightest = c[i];
            }
        }
        System.out.print(heightest);
    }
}
// 