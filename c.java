import java.util.Scanner;
public class c
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 12
        int a[] = new int[n]; 
        int b[] = new int[1000000]; 
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt(); // 1 1 1 0 1 0 1 0 1 1 1 1
        }   // 3  2  3  3   3
        int count = 1 ;
        int p = 0;
        for (int j = 0 ; j<n ; j++)
        {
            for (int k = j+1 ; k<n ; k++)
            {
                if (a[k]!=1)
                {
                    break;
                }
                else
                {
                    if (a[j]==a[k] && a[j]==1 && a[k]==1 ) 
                    {
                        count++;   // 3
                    }
                }
            }
            while (count>1) // 3 > 1
            {
                b[p] = count;  // b[0] = 3
                p++; // 1
                break;
            }
            count = 1;
        }
        int great = b[0];
        if (p==0)
        {
            System.out.print("1");
        }
        else
        {
            for (int s = 0 ; s<p ; s++)
            {
                if (great<=b[s])
                {
                    great = b[s];
                }
            }
            System.out.print(great);
        }
    }
}