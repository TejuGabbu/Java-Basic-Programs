import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt(); // test
		for(int j = 1 ; j<=z ; j++)
		{	
			String s = sc.next();
			int a = s.length();
			char d = '_';
			int flag = 0;
			for(int i = 0 ; i<a ; i++)
				{
					int e = i;//3
					char c = s.charAt(i);
					if(c==d)
					{
						flag = 1;
					}
					else if(flag == 1)
					{
						int r = (int)c - 32; //66
						char t = (char)r;
						System.out.print(t);
						flag = 0;
					}
					else
					{
						System.out.print(c);
					}
				}
		}
	}
}