// program is to convert binary to decimal
import java.util.Scanner;
public class spd
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt(); // 2
		    String a[] = new String[n];
		    for (int z = 0 ; z<n ; z++)
			{
				a[z] = sc.next();
			}
            // 11111
            // 1011
            int le = 0;
            char la ='0';
            int k = 0;
            long f = 0;
            int b = 0; // f mein use karo 
            int d = 0;
            long sum = 0;
            int count= 0;
            int s = 0;
            for (int i = 0 ; i<n ; i++) // 101010
            {                         // 101
                le = a[i].length(); // 3
                s = le - 1; // 2
                while (count<le) // 0<= 3
                {
                    la = a[i].charAt(s); // 1
                    if (la=='1')
                     {
                        d = 1;
                    }
                    else
                    {
                        d = 0;
                    }
                    f = (long)Math.pow(2,b) * d; // 2^0 * 1 == 0
                    sum = sum + f; // 0
                    count++; //1
                    b++;//1
                    s--; //1
                }
                System.out.println(sum); // 42
                sum = 0;
                b = 0;
                s = 0;
                count = 0;
            }
    }
}