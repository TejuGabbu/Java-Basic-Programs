// program is to add array elements
import java.util.Scanner;
public class gt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; // 4
		int r[] = new int[1000]; // 4
		for (int z = 0 ; z<n ;z++)
		{
			a[z] = sc.nextInt(); //  6 3 5 9 0 5 8 0 3 5 
		}
		int m = sc.nextInt();
		int b[] = new int[m]; // 5
		for (int x = 0 ; x<m ;x++)
		{
			b[x] = sc.nextInt(); //  4 5 5 9 3 2 7 2 4 1
		}
        long s = 0;
        int p = n - 1;//3
        long sum = 0;
		for (int i = 0 ; i<n ; i++)
        {
            s = (long)a[i] *(long)Math.pow(10,p);
            sum = sum +s;
            p--;
        }
        // 2
        // 2 1
        // 4
        // 1 2 3 4
        long d = 0;
        int e = m - 1;//
        long sum1 = 0;
		for (int j = 0 ; j<m; j++)
        {
            d = (long)b[j] *(long)Math.pow(10,e);
            sum1 = sum1 +d;
            e--;
        }
        long f = 0;
        int count = 0;
        //  21 < 1234
        if (sum >sum1 )
        {
            f  = sum - sum1;
        }
        else
        {
            f = sum1 - sum ;
            count++;
        }
        // System.out.println(sum);
        // System.out.println(sum1);
        // System.out.println(f);
        int h = 0;
        while (f!=0)
        {
            long t =f%10;
            r[h] = (int)t;
            h++;
            f = f/10; 
        }
        if (count>=1)
        {
            System.out.print("-");
        }
        for (int w = h-1 ; w>=0 ; w--)
        {
            System.out.println(r[w]);
        }
    }

}