import java.util.Scanner;
public class stairs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 5
        int n = sc.nextInt(); // 12
        int p = 0;
        int mul = 1;
        int sum = 0;
        int count = 0;
        int q = 0;
        int f = 0;
        int j = 0;
        int b = 0;
        for (int i = a; i<=n ; i++) // 90
        {
            b = i;   //  b = 90
            f = i;   //f = 90
            j = i;   // j = 90;
            while (f!=0) // f != 90 
            {
                p = f%10;   //  p = 9
                count++;  // count = 2;
                f = f/10;   //  f = 0
            }
            while (j!=0) // j = 90
            {
                q = j%10; // q == 9
                for (int s = 1; s<=count ; s++) // count = 2   1<=2
                {
                    mul = mul * q ; //  mul = 9*9 = 81
                }
                sum = sum + mul; // sum = 9 + 81= 90
                j = j/10;  // j = 9
                mul = 1; 
            }
            if (sum == b)
            {
                System.out.print(b+" ");
            }
            count = 0;
            sum = 0;
            mul = 1;
        }
    }
}