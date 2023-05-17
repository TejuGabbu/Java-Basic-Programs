import java.util.Scanner;
public class ar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 7
		int b = sc.nextInt(); 
        int a[] = new int[n]; 
		int count = 1;
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++)
			{	
               a[i] = sc.nextInt();     // 7
			}
            //6   1                  // 3 3 4 4 5 5    -1
		for ( j = 0 ; j<n ; j++) //j = 6
			{
			  for (k = j+1 ; k<n ; k++) //k = 7
				{
					if (a[j]==a[k])
					{
						count++; //2
					}
				}
				if(count == b)
				{
					System.out.print(a[j]);
					break;
				}
			    count = 1;
                if (k-j==1)
                {
                    j++;//5
                }
			}
    }
}