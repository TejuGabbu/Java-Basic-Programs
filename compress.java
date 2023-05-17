1
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int f = 1 ; f<=t ; f++)
		{	
			String s = sc.next();
			char p = '0';
			int count = 0;
			for(int i = 0 ; i<s.length(); i++)
				{
					char c = s.charAt(i);
					// int a = (int)c;
					for(int j = i ; j<s.length() ; j++)
						{
							char  d = s.charAt(j);
							if(c==d && p!=c)
							{
								count++; // 1
							}
							else
							{
								break;
							}
						}
					if(count==1)
					{
					    System.out.print(c);
					}
					else if(count==0)
					{
						
					}
					else
					{
						System.out.print(c);
						System.out.print(count);
						p = c; // b
					}
					count = 0;
				}
			// count = 0;
			System.out.println();
		}
	}
}