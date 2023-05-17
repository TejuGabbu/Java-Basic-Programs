import java.util.Scanner;
public class practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 6
        int a[] = new int[n];
        for(int i = 0; i < n; i++) 
		{
            a[i] = sc.nextInt(); // 
        }
        int great = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0 ; i<n ; i++)
        {
            if (great<a[i])
            {
                great = a[i];
                ind = i;
            }
        }
        System.out.print(great+" ");
        System.out.println(ind);
        
        int smax = Integer.MIN_VALUE;
        int sind = -1;
        for (int i = 0 ; i<n ; i++)
        {
            if (smax<a[i] && i!=ind)
            {
                smax = a[i];
                sind = i;
            }
        }
        System.out.print(smax+" ");
        System.out.print(sind);
		//  // 3 0  1 1 9 7
        // //  0 <= i < j < k < arr.length

        // //  |arr[i] - arr[j]| <= a

        // // |arr[j] - arr[k]| <= b

        // // |arr[i] - arr[k]| <= c
        // int p = sc.nextInt(); // 7 2 3
	    // int q = sc.nextInt();
        // int r = sc.nextInt();   
        // int count = 0;
        // // 3 0  1 1 9 7
		// for (int i = 0 ; i<n ; i++) // 0
		// {
		// 	for (int j = i+1 ; j<n ; j++) // 1
		// 	{ 
		// 		for (int k = j+1 ; k<n ; k++) // 2
		// 			{
		// 				if (a[i]<n && a[j]<n && a[k]<n && a[i]-a[j]<=p && a[j]-a[k]<=q && a[i]-a[k]<=r && 0 <= i  && i< j && j < k && k < n)
		// 				{
		// 					count++;//2
		// 				}
		// 			}
		// 	}
		// }
        // System.out.print(count);







        //  char c ='6';
        //  int a = c - 48;
        //  System.out.print(a);
        //  long a = 12132111111123131313131311321313;
        //  System.out.print(a);

		    // int n = sc.nextInt(); // 5
            // BigInteger a =BigIntegerMath.factorial(n);
 
            // System.out.println("Factorial of " + n
            //                    + " is: " + a);
		//     String a[] = new String[n];
		// for (int i = 0 ; i<n ; i++)
		// 	{
		// 		a[i] = sc.next();
		// 	}
		// for (int j = 0 ; j<n ; j++)
		// 	{
		// 		System.out.println(a[j]);
		// 	}
    }
}
    // public static int sum(int a , int b)
    // {
    //     int sum = a+b;  // put your all logic hear
    //     return sum ;
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int p = sc.nextInt();
    //     int q = sc.nextInt();
    //     int fi = sum(p,q);
    //     System.out.print(fi);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); //8
		// int a = 0;
		// int count = 0;
		// int f = 0;
		// for (int i = 2 ; i<=n ; i++)
		// 	{
		// 		a = i; //12
		// 		f = i;
		// 		for (int j = 1 ; j<=a ; j++) // 1 to 12
		// 			{
		// 				if (a%j==0)
		// 				{
		// 					count++; // 3
		// 				}
        //                 if (count==3) // 1<=2
        //                 {
        //                     break;
        //                 }
		// 			}
		// 		if (count == 2 )
		// 		{
		// 			System.out.println(i);
		// 		}
		// 		count = 0;
		// 	}
        // Scanner sc = new Scanner(System.in);
		// long n = sc.nextLong(); // 9
		// long count = 0;
		// for (long i = 4 ; i<=n ; i++)
		// 	{
		// 		long p = i; // 4
		// 			for (long j = 1 ; j<=p/j ; j++)
		// 				{
		// 					long s = j* j; // 1*1
		// 					if (s==p)
		// 					{
		// 						count++;
		// 					}
		// 				}
		// 	}
		// System.out.print(count);
        // long a[] = new long[100000000];
        // for (int i = 1 ;  ; i++)
        // {
        //     a[i] = sc.nextLong();
        //     if (a[i]%2==0)
        //     {

        //     }
        //     else
        //     {
        //         break;
        //     }
        // }






        // int n = sc.nextInt();
        // long a[] = new long[n];
        // for (int i= 0 ; i<n ; i++)
        // {
        //     a[i] = sc.nextLong();
        // }
        // for (int i= 0 ; i<n ; i++)
        // {
        //     System.out.print(a[i]+" ");
        // }

        // long a = sc.nextLong();
        // long b = sc.nextLong();
        // long hcf = 0;
        // for (int i = 1 ; i<=a && i<=b ; i++)
        // {
        //     if (a%i==0 && b%i==0)
        //     {
        //         hcf = i;
        //     }
        // }
        // System.out.println("hcf is "+hcf);
        // int lcm = (a*b)/hcf;
        // System.out.print("lcm is "+lcm);
        // long n = sc.nextLong(); //8
		// long a = 0;
		// long count = 0;
		// long f = 0;
		// for (long i = 2 ; i<=n ; i++)
		// 	{
		// 		a = i; //2
		// 		f = i;
		// 		for (long j = 1 ; j<=a ; j++)
		// 			{
		// 				if (a%j==0)
		// 				{
		// 					count++;
		// 				}
		// 			}
		// 		if (count == 2 )
		// 		{
		// 			System.out.println(i);
		// 		}
		// 		count = 0;
		// 	}
//     }
// }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // 92453  // 39245
        // int k = sc.nextInt(); // 1
        // int a = n;//92453
        // int count = 0;
        // while (n!=0)
        // {
        //     int p = n%10;
        //     count++;// 5
        //     n = n/10;
        // }
        // int ten = 1;
        // int f = 0;
        // int s= 0;
        // if  (k>0)
        // {
        // while (k>=0) //  2>=0      //  This while loop is for k>=0
        // {
        //     if (k==f) //2
        //     {
        //         break;
        //     }
        //     s = a%10; // 3
        //     a = a/10;  // 9245
        //     for (int i = 1 ; i<=count-1 ; i++) // 1 to 4
        //     {
        //         ten = ten * 10; // 10000
        //     }
        //     a = (s*ten) + a; // 3*10000 + 9245 =30000+9245 =  39245
        //     f++; // 1
        //     ten = 1;
        // }
        // System.out.print(a);
        // }
        // else
        // {
        //     while (k<0) // -1
        //     {
        //         if (k==f)
        //          {
        //             break;
        //          }
        //         for (int j = 1 ; j<=count-1 ; j++) // 1 to 4
        //         {
        //             ten = ten * 10; // 10000
        //         }
        //         s = a%ten;
        //          a = a/ten;
        //          a = (s*10) + a ;
        //          f--;
        //          ten = 1;
        //     }
        //     System.out.print(a);
//         }
//     }
// }