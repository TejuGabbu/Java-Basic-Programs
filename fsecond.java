/// program is to find the second largest number in array
import java.util.Scanner;
public class fsecond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int greatest = a[0];
        int count = 0;
        for (int i = 1 ; i<n ; i++)
        {
            if (greatest<a[i])
            {
                greatest = a[i];      //  loop for 1st greatest
                count++;
            }
        }
        int p = greatest;
        int agreat = a[0];
        for (int i = 1 ; i<n ; i++)
        {
            if (agreat<a[i] && a[i]!=p)
            {
                agreat = a[i];      //  loop for 1st greatest
            }
            else if (agreat>a[i] && agreat==p)
            {
                agreat = a[i];
            }
            else
            {
                agreat = agreat;
            }
        }
        System.out.println(agreat);
    }   
}