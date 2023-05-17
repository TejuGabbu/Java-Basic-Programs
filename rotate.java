import java.util.Scanner;
public class rotate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4
        int f = n ;
        int q = n;
        int p = n; //4
        long a[] = new long[n];
        long b[] = new long[n];
        for (int z = 0 ; z<n ; z++)
        {
            a[z] = sc.nextLong();
        }
        //  1 2 3 4   // 4
        int m = sc.nextInt(); // 3
        int d = 0;
        // p - 4;
        int s = 0;
        int count = 0;
        int fcount = 0;
        // for (int i = 1; i<m ; i++)
        // {
            for (int j = 1 ; j<=m ; j++) // 2   1  2  3  4
            {
                n++; //6
                for (int k = j ; k<n ; k++)//   1<6
                {
                    b[d] = a[k]; //b[0] =3   b[1]=4  b2 =1  b3=2
                    d++;//4
                    if (d==q) // 4==4
                    {
                        break;
                    }
                    count++;// 3
                    if (count==p-1) //3==2
                    {
                        k = -1;
                    }
                }
                d = 0;
                fcount++; // 2
                count = 0;
                p--;//3
            }
        // } // 1 2 3 4 5
        for (int t = 0; t<f; t++)
        {
            System.out.print(b[t]+" ");
        }
    }
}