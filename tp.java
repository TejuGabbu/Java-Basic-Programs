import java.util.Scanner;
public class tp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 6
        int a[] = new int[n];   // 12 15 17 18 19 20
        int p[] = new int[n];
        int j = 0;
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ;i++)
        {
            if (a[i]%5==0)
            {
                while (j<n)
                {
                    p[j] = a[i]; // 15 
                    j++;   
                    break;        
                }
            }
        }
        
    }
}