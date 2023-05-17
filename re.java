import java.util.*;
class re
{
    public static ArrayList<Integer> f(int a[][] , int sr , int sc, int dr , int dc ,ArrayList<Integer> tej,int sum )
    {
        if(sr>dr || sc>dc)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            return temp;
        }
        sum = sum + a[sr][sc];
        tej.add(a[sr][sc]);
        if(sr==dr && sc==dc)
        {
            if(sum==10)
            {
                return tej;
            }
        }
        f(a, sr, sc+1, dr, dc, tej, sum);
        f(a, sr+1, sc, dr, dc, tej, sum);
        return tej;
    }
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
        ArrayList<Integer> tej = new ArrayList<>();
        ArrayList<Integer> r = f(a,1,1,n,m,tej,0);
        System.out.println(r);
    }
}