import java.util.Scanner;
public class pp
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			int a = s.length();
			System.out.print(a);
			int flag = 0;
			int fcount = 0;
			int f = 0;
			int g = 0;
			int j = a-1;
			for(int i = 0 ; i<a ; i++) // teet
				{
					char c = s.charAt(i);//t
					f = (int)c;
					flag = 0;
					while (j>=0 )
						{
					     	char d = s.charAt(j); t	
						    g = (int)d;
							Int r = g+32;
							int x = f-32;
							if((f>(f>=92 && f<=122 && g>=65 && g<=90 ) || (f>=65 && f<=90 && g>=92 && g<=122))
							{
								if((c==d) || ( r== f) || (x == g))
								{
									flag = 1;
								}
								else
								{
									// System.out.print("0");
									fcount++;
									break;
								}
							}	
							break;
						}
					if(fcount>=1)
					{
						break;
					}
					j--;
				}
			if(flag ==1)
			{
				// System.out.print("1");
			}
		}
	}