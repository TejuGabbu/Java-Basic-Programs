// program to check given are triangle or not
import java.util.Scanner;
public class triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = a+b;
        int q = b+c;
        int r = c+a;
        if (p>c && q>a && r>b)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}