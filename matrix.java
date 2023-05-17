import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // rows = 3
        int n = sc.nextInt();  // columns = 3
        int a[][] = new int[m][n];
        int count = 0;
        for (int i = 0 ; i<m ; i++)
        {
            for (int j = 0 ; j<n ; j++)    // 1 2 3 
            {                              // 4 5 6 
                a[i][j] = sc.nextInt();    // 7 8 9
            }
        }
        for (int i = 0 ; i<m ; i++)
        {
            for (int j = 0 ; j<n ; j++)    
            {                              
            }
        }

    }
}