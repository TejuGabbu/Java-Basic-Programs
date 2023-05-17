import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])throws IOException
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt(); //rows
		int m = sc.nextInt(); // colums
		int a[][] = new int[n][m];
		for(int i = 0 ; i<n ; i++)
			{
			  for(int j = 0 ; j<m ; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
		int r = 0; 
		int c = 0;
		while (r<n && c<m)
			{
				for(int i = r ; i<n ; i++ )
					{
						System.out.print(a[i][c]+" ");
					}
				
				c++; //1
				for(int i = c ; i<m ; i++) //c 1   to m 3
					{
						System.out.print(a[n-1][i]+" ");
					}
				n = n - 1; //3
				if(r < n) // 1<3
				{
					for(int i = n - 1 ; i>=0 ; i--)
						{
							System.out.print(a[i][m-1]+" ");
						}
					m = m -1; //3
				}
    //r < n
				
				if(c < m) 
				{
					for(int i = m-1 ; i>0 ; i--)
						{
							System.out.print(a[r][i]+" ");
						}
					r++; //1
				}	
			}      
    }
}
