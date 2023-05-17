// greatest in an array elements
import java.util.Scanner;
public class great
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0 ; i<n ;i++)
        {
            a[i] = sc.nextInt();
        }
        int greatest = a[0];
        for (int i =1 ; i<n ;i++)
        {
            if (a[0] < a[i])
            {
                greatest = a[i];
            }
        }
        System.out.println(greatest);
    }

}