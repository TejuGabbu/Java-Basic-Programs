import java.util.*;
public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		int count = 0 ;
		int max = 1;
		int a[] = new int[1000000];
		char b[] = new char[1000000];
		int k = 0 ;
		for(int i = 0 ; i<s.length() ; i++)
		{
			char c = s.charAt(i);//z
			for(int j = i ; j<s.length() && s.charAt(j)==c ; j++)
			{
				if(s.charAt(i)==s.charAt(j))//a		
				{
					count++; //3
				}
			}
			if(1<count)
			{
				max = count ; //
				a[k] = count;//numbers
				b[k] = s.charAt(i);  // character
				i = i+(count-1); //
				k++;
			}
			count = 0;
		}
		int same = a[0]; //3
		int x = 0 ;
		int m = 123;
		char f ='0';
		int fcount = 0;
		// for(int i = 0 ; i< k ; i++)	// 0 1 2	
		// 	{
		// 		if(same == a[i]) // 3==3
		// 		{
		// 			fcount++;//3
		// 			x = (int)b[i]; //98
		// 			if(m>x)//99>98
		// 			{
		// 				m = x;//98
		// 				f = (char)m;
		// 			}
		// 		}
		// 	}
		// if(fcount==k)
		// {
		// 	// System.out.print(f);
		// }
		for(int i = 0 ; i<k ; i++)
			{
				System.out.println(b[i]+" "+a[i]);
			}
		
		
    }
}