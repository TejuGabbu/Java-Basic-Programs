import java.util.Scanner;
public class tejk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for(int p = 1 ; p<=t+1 ; p++)
        {
		    String s = sc.nextLine();
			int n = s.length();
		    int count = 1;
		    for(int i = 0 ; i<n ; i++)
			{
				if(s.charAt(i) ==' ' && i+1<n && s.charAt(i+1)!=' ')
				{
					count++;
				}
			}
            if(count!=1)
            {
    			System.out.println(count);
            }
         
        }
        // String s = "Tejas kulkarni";
        // int n = s.length();
        // int ind = 6;
        // String s1 = s.substring(0,ind); // 0<6
        // String s2 = s.substring(ind+1,n);
        // System.out.println(s1);
        // System.out.println(s2);
        // String a[] = new String[n];
        // int k =0 ; //4
        // a[k]="";
        // for(int i = 0 ; i<n; i++)
        // {
        //    a[k] = a[k]+s.charAt(i);
        // }
        // System.out.print(a[k]);;
    }
}