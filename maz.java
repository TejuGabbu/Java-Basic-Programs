import java.util.*;
public class maz
{
	public static void f(int mat[][], int sr, int sc, int dr, int dc, ArrayList<Integer> tt, int sum)
	{
		if(sr > dr || sc > dc)
		{
			return;
		}
		sum = sum + mat[sr][sc];
		tt.add(mat[sr][sc]);
		if(sr == dr && sc == dc)
		{
			if(sum==10)
			{
				System.out.println(tt);
			}
			// return;
		}
		f(mat,sr , sc+1 , dr , dc,tt,sum);
		f(mat,sr+1 , sc , dr , dc,tt,sum);
		tt.remove(tt.size()-1);
        return ;
	}
	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];    
        for(int i = 0 ; i<n ; i++)
        {
			for(int j = 0 ; j<m ; j++)
            {
				a[i][j] = sc.nextInt();
            }
        }
        sc.close();
		ArrayList<Integer> tt = new ArrayList<>();
		f(a,0,0,n-1,m-1,tt,0);
		// System.out.println(res);
	}
}