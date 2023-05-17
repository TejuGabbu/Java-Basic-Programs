import java.io.*;
import java.util.*;
public class stt
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = n;
		int m = n;
		int p = n*n;
		int a[] = new int[p];
		for(int i = 0 ; i<p ; i++)
			{
				a[i] = sc.nextInt();
			}
		int tejas = 0;
		int count  = 0;
		for(int i = 0 ; i<n ; i++)
			{
				count = 0;
				for(int j = i ; j<p ; j++)
					{
						if(a[i] == a[j])
						{
							count++;
							// System.out.println(count);
							j = j + (m - j); //1+3
						}
					}
				if(count==f)
				{
					tejas++;
				}
			}
        System.out.print(tejas);
    }
}
