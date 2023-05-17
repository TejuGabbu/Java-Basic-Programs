import java.util.Scanner;
public class each
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 3
        int a = sc.nextInt();   // 456
        int f[] = new int[n];
        int i = 0;
        while(i<n)
        {
            int l = a%10;
            f[i]=l;
            System.out.println(f[i]);
            a = a /10;
            i++;
        }
    }
}