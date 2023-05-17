import java.util.*;
public class maze 
{
    public static ArrayList<Integer> print(int a[][],int n , int m) 
    {
        ArrayList<Integer> tej = new ArrayList<>();
        ArrayList<Integer> result = f(a,0,0,n-1,m-1,tej);
        return result;    
    }


    //using arrayList

    
    public static ArrayList<Integer> f(int a[][],int sr ,int sc ,int n , int m , ArrayList<Integer> tej) 
    {
        if(sr>n || sc>m)
        {
            return tej;
        }
        tej.add(a[sr][sc]); // 0 3 4
        if(sr==n && sc==m)
        {
           return tej;
        }
        f(a, sr, sc+1, n, m,tej);
        f(a, sr+1, sc, n, m,tej);
        return tej;
    }


    // to print direct 

// public static void f(int a[][],int sr , int sc , int dr, int dc, String asf,int sum) 
//     {
//         if(sr>dr || sc>dc)
//         {
//             return;
//         }
//         sum = sum + a[sr][sc];
//         if(sr==dr && sc==dc)
//         {
//             if(sum==10)
//             {
//                 System.out.println(asf);
//             }
//             return;
//         }
//         f(a,sr, sc+1, dr, dc, asf+"h",sum);
//         f(a,sr+1, sc, dr, dc, asf+"v",sum);
//         return;
//     }
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
        //f(a,0,0,n-1,m-1,"",0);
        ArrayList<Integer> r = print(a,n,m);
        System.out.println(r);
    }    
}
