import java.util.Scanner;
public class Main
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			int a = s.length();
			int flag = 0;
			int fcount = 0;
			int f = 0;
			int g = 0;
			int j = a-1;
			for(int i = 0 ; i<a ; i++) // teet
				{
					char c = s.charAt(i);//t
					f = (int)c;// 116
					flag = 0;
					fcount = 0;
					while (j>=0 ) //3
						{
					     	char d = s.charAt(j); 	
						    g = (int)d;//116
							int r = g+32; //
							int x = f-32;
							if((f>=92 && f<=122 || g>=65 && g<=90 ) || (f>=65 && f<=90 || g>=92 && g<=122))
							{
								if(c==d || r== f || x == g)
								{
									flag = 1;
								}
								else
								{
									System.out.print("0");
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
				System.out.print("1");
			}
		}
	}