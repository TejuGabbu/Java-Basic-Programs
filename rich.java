// If input is 'A' , print "I am the first letter", 
// If input is 'B' , print "I am the second letter", 
// If input is 'C' , print "I am the third letter",
// If input is 'D' , print "I am the fourth letter", 
// If input is 'E' , print "I am the fifth letter",
// For any other input character, print "I don't belong here"
import java.util.Scanner;
public class rich
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        char c = sc.next().charAt(0);
        switch (c)
        {
            case A:
            System.out.print("I am the first letter");
            break;
            
            case B:
            System.out.print("I am the second letter");
            break;
            
            case C:
            System.out.print("I am the third letter");
            break;
            
            case D:
            System.out.print("I am the third letter");
            break;
            
            case E:
            System.out.print("I am the third letter");
            break;

            default:
            System.out.print("I don't belong here");
            break;
        }
    }    
}