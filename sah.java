import java.util.Scanner;
public class sah
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
        int p = greatest; // 4 
        // // 4 3 2 1
        int agreat = a[0]; 
        for (int i = 0 ; i<n ; i++)  // 4
        {
            for (int j = i+1 ; j<n ;j++)
            {
                //3
                 if (agreat<a[j] && agreat!=p && a[j]!=p) // 5 < 4  
                  {
                     agreat = a[j]; // 5
                }
                else if (agreat==p) // 4 == 4
                {
                 agreat = a[j];
                 }
            }
        }
        System.out.print(agreat);
    }
}
