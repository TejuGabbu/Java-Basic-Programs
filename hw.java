import java.util.*;
public class hw
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		int c[][] = new int[n][m];
		for (int i = 0 ; i< n ; i++)
			{
				for (int j = 0 ; j<m ; j++)
					{
						a[i][j] = sc.nextInt();
					}
			}
		int min = a[0][0];
		int k = 0 ;
        int l = 0;
      for (int i = 0 ; i<n ; i++)
		  {
			  for (int j = 0 ; j<m ; j++)
				  {
					  if (min>a[i][j])
					  {
						  min = a[i][j];
					  }
				  }
			  b[k][l] = min; //b00 - 1 b01 - 4  b02 - 7  
			  l++; // 2
			  min = Integer.MAX_VALUE; // 1213123
		  }
		int i = 0;
		int j = 0;
		int count = 0;
		int p =0;
        int q= 0;
		min = Integer.MIN_VALUE;
		while (i<n) // 0<3
			{
				count++; // 3
				while (j<m) // 1<3
					{
						if(min<a[i][j]) // 5<8
						{
							min = a[i][j]; // 5
						}
						i++; // 3
						if ( i==n) //i==3 // 3==3
						{
							c[p][q] = min; // c00-7 c01- 8 c02 - 9
							min = Integer.MIN_VALUE;
							q++;//2
							i = 0; // 0
							j++; //2
							break;
						}
					}
				if (count==m)
				{
					break;
				}
			}   //// c00 - 7 c01 -  8    c02  - 9  c03 -// main
		   //////b00 - 1 b01 - 4  b02 - 7  03 04 0 5
           int e = 0;
           int f = 0;
		   int s = 0;
		   int x = 0;
		   int fcount = 0;
				for (int t = 0 ; t<n ; t++)
                { 
                    for (int r = 0 ; r<m ; r++)
					{
						if (b[s][t] ==  c[x][r]) // b00 == c01
						{
							System.out.print(b[s][t]+" ");
							fcount++;
						}
					}
                }
				if (fcount ==0)
				{
					System.out.print("-1");
				}
			
		
		
    }
}