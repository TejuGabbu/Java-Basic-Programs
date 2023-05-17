//greatest element in each row
import java.util.Scanner;
public class great1
{
    public static void main(String[] args)
    {                                               
        Scanner sc = new Scanner (System.in);   
        int n = sc.nextInt(); // rows input   3
        int m = sc.nextInt(); // column input  3
        int a[][] = new int[n][m];        
        for (int i =0 ; i<n ; i++)
        {
            for (int j = 0 ;j<m ;j++)
            {
                a[i][j] = sc.nextInt();   
            }
        }
        System.out.println();
        int mx = a[0][0];
        for (int i =0 ; i<n ; i++)
        {
            for (int j = 0 ;j<m ;j++)
            {
                if (mx < a[i][j])
                {
                    mx = a[i][j];
                }
            }
        System.out.println(mx);  
        }    
    }
}