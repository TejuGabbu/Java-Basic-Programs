import java.util.*;
public class co 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
		long min = Integer.MIN_VALUE;
		// System.out.print(min); -2 -3 4 -1 -2 1 5 -3
		for (int i = 0 ; i<n ; i++)
			{
				a[i] = sc.nextLong();
			}
			//2 3 1 -1 0
		long max = 0 ;
		long sum = 0;
		for (int i = 0 ; i<n ; i++) // 2
			{
				for (int j = i ; j<n ; j++)//-1
				{
					sum = sum + a[j]; // 6-1 ==5
					if (min<sum) // 6<-5
					{
						max = sum; // // 6
						min = sum ; // 6
					}
				}
				sum = 0;
			}
		System.out.print(max);
    }
}