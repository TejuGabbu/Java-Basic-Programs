//The greatest common divisor of 15 and 70 can be calculated as:

// The product of 15 and 70 is given as, 15 × 70
// The LCM of (15, 70) is 210.
// GCD (15, 20) = (15 × 70)/ 210 = 5.
// ∴ The greatest common divisor of (15, 70) is 5
import java.util.Scanner;
public class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s[] = new int[100]; // a's table array
        int t[] = new int[100]; // b's table array
        int j = 0;
        int lcm = 0;
        for (int i = 1 ; i<=100 ; i++) // a's table
        {
            int p = a*i;
            while(j<100)
            {
                s[j] = p; // a's main table elements
                j++;
                break;
            }
        }
        int l = 0;
        for (int k = 1 ; k<=100 ; k++) // b's table
        {
            int q = b*k;
            while(l<100)
            {
                t[l] = q; //  b's main table element
                l++;
                break;
            }
        }
        // System.out.print(t[2]);
        int count = 0;
        for (j = 0 ; j<100 ;j++)
        {
            for (l = 0 ; l<100 ; l++)
            {
                if (s[j]==t[l])
                {
                    count++;
                    lcm = s[j];
                }
            }
            if (count == 1)
            {
                // System.out.print(s[j]+" is the lcm of "+a+ " and "+b+" ");
                break;
            }
        }
        int gcd = (a*b)/lcm;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}