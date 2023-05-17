import java.util.Scanner;
public class per
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int f = ((a+b)*100)/t;
        System.out.print(f+"%");
    }
}