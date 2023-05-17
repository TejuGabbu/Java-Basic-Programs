import java.util.*;
public class reverse 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ori = n;
        sc.close();
        int reverse = 0;
        while(n!=0)
        {
            int p = n%10;
            reverse = reverse*10+p;
            n = n/10;
        }
        if(ori==reverse)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }    
}
