import java.util.Scanner;
public class arm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 153
		int d = n.length();
		int p = 0;
		int a = 0;
		int s = 0;
		int sum = 0;
		int f = 0;
		for (int i = 1 ; i<= n ; i++)
			{
				p = i;
				f= i;
				while (p!=0)
					{
						a = p%10; // 3	
						s = a*a*a;	 // 27
						sum = sum + s ; // 0 + 27
						p = p/10;
					}
				if (sum==f)
				{
					// System.out.println(f);
				}
				sum = 0;
			}
    }
}