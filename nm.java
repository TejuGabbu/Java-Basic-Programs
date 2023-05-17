import java.util.*;
public class nm
{
    public static void getpaths(int a[][], int sr, int sc,
									int dr, int dc, ArrayList<Integer> tt)
        {
            if(sr > dr || sc > dc)
            {
                return;
            }
            tt.add(a[sr][sc]);
            if(sr==dr && sc==dc)
            {
                System.out.println(tt);
            }
            getpaths(a, sr, sc+1, dr, dc,tt);
            getpaths(a, sr+1, sc, dr, dc,tt);
            tt.remove(tt.size()-1);
            return;
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] =new int[n][m];    
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        ArrayList<Integer> tt = new ArrayList<>();
        getpaths(a,0,0,n-1,m-1,tt);
    }
}