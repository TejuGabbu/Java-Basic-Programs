import java.util.Scanner;
public class two
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3
        int m = sc.nextInt(); // 3
        int a[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ;j<m ;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        // System.out.println();
        int great = a[0][0];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ;j<m ;j++)
            {
                if(great<a[i][j])
                {
                    great = a[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(great);
    }
}