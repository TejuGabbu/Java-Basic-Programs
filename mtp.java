import java.util.*;
public class mtp
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a[] = new int[n];
        int b = 1;
        for(int i = 0; i<n ; i++)
        {
            a[i] = b;
            b++;
        }
        int ct = 0;
        int i = 0;
        int k = 0;
        int p = 0;
        int t[] = new int[n];
        int s[] = new int[n];
        while(i>=0)
        {
            if(ct%2==0) // even 
            {
                for(int j = 0 ; j<n ; j++) // j=0 , 1 n <2
                {
                    if(j%2!=0)
                    {
                        t[k] = a[j]; //a0 - 6
                        k++; // 1
                    }
                }
                int o = 0;
                for(int e = 0 ; e<k ; e++)
                {
                    a[o] = t[e];
                    o++;
                }
            }
            else // for odd
            {
                for(int j = 0 ; j<k ; j++) // 0 to 3 means 4
                {
                    if(j%2==0)
                    {
                        s[p] = a[j];
                        p++; // 2
                    }
                }
                int o = 0;
                for(int e = 0 ; e<p ; e++)
                {
                    a[o] = s[e];
                    o++;
                }

                k = 0;
            }
            if(a.length==1)
            {
                System.out.println(a[0]);
                break;
            }
            ct++; // 2
            i = 0;
            n = p; // 
        }
    }
}