import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int a)
    {
        data = a;
        next = null;
    }
}
class linkedlist
{
    Node head;
    void add(int d)
    {
        Node nn = new Node(d);
        if(head==null)
        {
            head = nn;
            return;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = nn;
    }
    void printlist()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class tej
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++)            
        {
            ll.add(sc.nextInt());
        }
        ll.printlist();
        sc.close();
    }
}