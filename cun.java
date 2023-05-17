import java.util.Scanner;
public class cun
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for(int p = 1 ; p<=t ; p++)
        {
		    String s = sc.nextLine();
		    char sp =' ';
		    int count = 0;
		    for(int i = 0 ; i<s.length() ; i++)
			{
				char c = s.charAt(i);
				// System.out.print(s.charAt(4));
				int a = (int)c;
				if(c==' ')
				{
					count++;
				}
			}
		  System.out.print(count+1);
        //   count = 0;
        }
	}
}