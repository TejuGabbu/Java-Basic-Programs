import java.util.*;
public class t
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = Integer.MIN_VALUE;
		int a[] = new int[n];
		for (int i = 0 ; i< n ; i++)
			{
				a[i] = sc.nextInt();
			}//1 2 3 1 1 
		int count = 0;
		int sum = 0;
		for (int i = 0 ; i<n ; i = i+2) // 1  8
			{
				count++; //2
				sum = sum +a[i]; // i = 4 // 3+1 = 4
				if (count==2 && s<sum) //1<4
				{
					s = sum; //4
					sum = 0; //
					count = 0;
					i = i - 2; //2 -2 = 0
				}
			}
		int fcount = 0; //1 2 3 1 1 5
        int sum1 = 0;
		int t = Integer.MIN_VALUE;
		for (int j = 1 ; j<n ; j =j+2)// 1 3 1
			{
				fcount++; //1
				sum1 = sum1 + a[j]; //
				if (fcount==2 && t<sum1)
				{
					t = sum1;
					sum1 = 0;
					fcount = 0;
					j = j - 2;
				}
				if (n==3)
				{
					t = a[j];
					break;
				}
			}
        //  System.out.print(s +" "+t);   
		if (n==2)
		{

		}
		else if (s>=t)
		{
			System.out.print(s);
		}
		else
		{
			System.out.print(t);
		}
    }
}
// 166
// 579
// 877
// 972
// 617
// 434
// 586
// 455
// 888
// 788
// 490
// 823
// 923
// 474
// 577