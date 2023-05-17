import java.util.*;
public class od
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];
		for (int i = 0 ; i<n ; i++)
			{
				a[i] = sc.nextLong();
			}
		// 1 0 0 5 3 9 0
		long min = 1;
		int k = 0;
		int count = 0 ; //  0 5 0 3
		int fcount = 0;
		for (int i = 0 ; i<n ; i++) // i = 2
			{
				if (a[i]==0)
				{
					        for (int j = i +1 ; j<n ; j++)
						    {
							    count++;//3
							    if (a[j]%2!=0)
							    {
								    fcount++;//2
								    long odd = a[j]; // 5   // odd - 3
								    if (min<odd) //5<3
								    {
								    	min = odd; // 5
								    }
							    }
						    }					
					     if (count==0)
					     {
					    	b[k] = 0;
					    	break;
					    }
					    else if (fcount ==0)
					    {
					    	b[k] = 0;	
					     }
					     else
					    {
					    	b[k] = min; // b0 - 5
				        	k++;//1
					        count = 0 ;
					        fcount = 0;
                            min = 1;
					        continue;
					    }
					count = 0 ;
					fcount = 0;
					min = 1;
				}
				b[k] = a[i]; // b0 -1  b3 = 5 b4   b5 
				k++;//4
			}
		for (int d = 0 ; d<n ; d++)
			{
				System.out.print(b[d]+" ");
			}
    }
}