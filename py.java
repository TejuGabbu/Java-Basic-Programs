import java.util.Scanner;
public class py
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (a*a) + (b*b);
        int p = c*c;
        if(s==p)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}