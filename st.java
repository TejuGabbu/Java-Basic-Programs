// program is to prrint 
import java.util.Scanner;
public class st
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 15
		int a = 1;
		int first = 0;
		for (int i = 1 ; i<= n ; i++)
			{
				first = n - 6; // 17 - 6 = 11
				for (int j = 0 ; j<first ; j++)
					{
						System.out.println(a);
						a++;// 11
					}
				if (a==10)
				{
					a = 1;
					n++;
				}
				else
				{
					n++; // 17
					a = (a-first)+1; // 11 - 10 =1 +1 = 2 
				}
			}
    }
}