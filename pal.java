import java.util.Scanner;
public class pal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); // 5834 
        long m = n;
        long a[] = new long[100];
        int i = 0;
        long p = 0;
        int count = 0 ;
        int fcount = 0;
        if(n<0)
        {
            System.out.print("not palindrome");
        }
        else
        {
            while(n!=0)
            {                                     //  length of number
                long s = n%10;
                count++;
                n = n/10;
            }  
            while (m!=0)
            {
                p = m%10;
                while(m!=0)
                {
                    a[i] = p; 
                    break;
                }
                i++;
                m = m/10;
            }   
            for (int k =count-1 ; k>=0 ; k--) //  3 to 0  4 elements
            {
                for (int j = 0 ; j<count ; j++)  // 0 to 3  4 elements
                {
                    if (a[k] == a[j])
                    {
                        fcount++;
                        break;
                    }
                    break;  
                }
            }
            // System.out.println(count);
            // System.out.println(fcount);
            if(fcount==count)
            {
                System.out.print("palindrome");
            }
            else
            {
                System.out.print("not palindrome");
            }
        }    
    }
}