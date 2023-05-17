import java.util.Scanner;
public class search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 3
        int m = sc.nextInt();   // 4
        int count = 0;
        int a[][] = new int[n][m];
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<m ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int t = sc.nextInt();
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<m ; j++)
            {
                if (t==a[i][j])
                {
                    count++;
                }
            }
        }
        if (count>=1)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}