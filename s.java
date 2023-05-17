import java.util.Scanner;
public class s
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10000];
        int n = sc.nextInt(); // 23
        int p = 0 ; 
        int sum = 0;
        int pt = 0;
        while (n!=0) 
        {
            p=n%10;    
            sum = sum+p;    
            n = n/10;
        }
        pt = sum;
        int t = 0 ;
        int i = 0 ;
        int count = 0;
        int fsum = 0;
        while(sum!=0)
        {
            t = sum%10;
            while (sum!=0)
            {
                a[i] = t;   
                fsum = fsum + a[i];
                count++;       
                i++;           
                break;
            }
            sum = sum/10;
        }
        if (count==2)
        {
            System.out.print(fsum);
        }
        else if(count==1)
        {
            System.out.print(pt);
        }
    }
}
