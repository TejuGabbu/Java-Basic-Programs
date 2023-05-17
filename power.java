import java.util.Scanner;
public class power
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 16   2^4
        int i = 1;
        int mul = 1;
        int count = 0 ;
        if (n==1)
        {
            System.out.print("true");

        }
        while (i<=1000)
        {
            mul = mul * 2; // 16 
            if (mul==n)
            {
                System.out.print("true");
                count++;
                break;
            }
            i++;
        }
        if(count == 0 && n!=1)
        {
            System.out.print("false");
        }
    }
}