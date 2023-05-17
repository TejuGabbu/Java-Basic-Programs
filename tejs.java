import java.io.*;
import java.util.*;
public class tejs
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0 ; i<n ; i++)
			{
				for (int j = 0 ; j<n ; j++)
					{
						a[i][j] = sc.nextInt();
					}
			}
		int sumb = 0;
		int sumw = 0;
		int count = 0;
	for (int i = 0 ; i<n ; i++) // 0
		{	
			count++;//2
				for (int j = 0 ; j<n ; j++) // 0
				{
					if (count%2!=0) //odd
					{	
					   if (i%2==0 && j%2==0)	
					   {
						 sumb = sumb+a[i][j];// 0+1
					   }
					}
					else if (count%2==0) //even
					{
						if (i%2!=0 && j%2!=0)
						{
							sumb = sumb + a[i][j];
						}
					}
					
				}
			
		}
    count = 0 ;

	for (int i = 0 ; i<n ; i++) // 0
		{	
			count++;// 2
				for (int j = 0 ; j<n ; j++) // 0
				{
					if (count%2!=0) //odd
					{	
					   if (j%2!=0)	
					   {
						 sumw = sumw+a[i][j]; // 0+1
					   }
					}
					else if (count%2==0) //even
					{
						if (j%2==0)
						{
							sumw = sumw + a[i][j];
						}
					}
					
				}
			
		}
        System.out.println(sumb);
        System.out.println(sumw);


		
    }
}


