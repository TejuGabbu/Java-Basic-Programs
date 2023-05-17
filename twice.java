import java.util.Scanner;
public class twice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // how many elements   // 4
        int a[] = new int[n]; //    2 1 5 3 
        int count = 0;
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();     // take array elements
        }
        int greatest = a[0];
        int p = 0;
        for (int i = 1 ; i<n ;i++)
        {
            if (greatest<a[i])   // 2 1 7 3
            {
                greatest = a[i];
                p = i;  // index
            }
        }
        for (int i = 0 ; i<n ; i++)  // 2 1 7 3
        {
            if (greatest >= a[i]*2 && a[i]!=greatest)
            {
                count++;
            }
        }
        int s = n-1;
        if (count==s)
        {
            System.out.print(p);
        }
        else
        {
            System.out.print("-1");
        }
    }
}