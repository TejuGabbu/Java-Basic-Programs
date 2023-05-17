import java.util.*;
public class Main 
{
    public static void main(String[] args) throws Throwable
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++) 
		{
            a[i] = sc.nextInt();
        }
		int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0 ; i<m ; i++) 
		{
            b[i] = sc.nextInt();
        }
		int count = 0;
		int ind = -1;
		int p = -1;
		for(int i = 0 ; i<m ; i++) //2 arr
			{
			
				for(int j = 0 ; j<n ; j++) //1 arr
					{
						if(b[i]==a[j] && j!=ind)
						{
							count++; //2
							ind = j; // 0
						}
					}
             
				
			}
		
        
    }
}
