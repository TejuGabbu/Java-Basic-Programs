import java.util.*;
public class two1
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long a[]  = new long[n];
        long f[]  = new long[1000000];
        for (int i = 0; i < n; i++) 
		{
            a[i] = sc.nextLong();
        }
		Arrays.sort(a);
		int k = 0;
        int count = 0;
		for(int i = 0 ; i<n ; i++)
		{
		    for(int j = i ; j<n && a[j]==a[i] ; j++)
		    {
		        if(a[i]==a[j])
		        {
		            f[k] = a[i];
		            count++;
		        }
              
		    }
		    k++;
		    i = i +(count-1); //2 +(2-1); 3
		    count = 0;
		}
		for(int i = 0 ; i<k ; i++)
			{
				for(int j = i+1 ; j<n ; j++)
					{
						if(f[i]+f[j]==t)
						{
						    System.out.println(f[i]+" "+f[j]);
						}
					}
			}
    }
}