import java.util.Scanner;
public class arrsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = {{1,2},{5,6}};
        int n = a.length;
        int m = a[0].length;
        int sum = 0;
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<m ;j++)
            {
                sum = sum + a[i][j];
            }
        System.out.println(sum);
        sum = 0;    
        }
    }
}