import java.util.Scanner;
public class a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //145      
		int f = a;
		int p = 0;
		int fact = 1;
		int sum = 0;
         while (f!=0)
			{
				p = f%10; // 5
				for (int j = 1 ; j<=p ; j++) // p = 2
					{
						fact = fact * j;
					}
					sum = sum + fact; // sum = 1
					f = f/10;
					fact = 1;
			}
    }
}