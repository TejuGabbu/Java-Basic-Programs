import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class linkedlist
{
    Node head;

    void insert(int a)
    {
        Node nn = new Node(a);
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
}

class Solutions
{
    public Node removedublicates(Node head)
    {
        Node curr = head;
        Node dummy = new Node(-1);
        Node t = dummy;
        while(curr!=null)
        {
            if(curr.next!=null && curr.data==curr.next.data)
            {
                Node a = curr;
                while(a!=null && curr.data==a.data)
                {
                    a = a.next;
                }
                curr = a;
            }
            else
            {
                t.next = curr;
                t = t.next;
                curr = curr.next;
            }
        }
        t.next = null;
        return dummy.next;
    }
}
public class rd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        linkedlist ll = new linkedlist();
        for(int i = 0 ; i<n ; i++)
        {
            ll.insert(sc.nextInt());
        }
        Solutions obj = new Solutions();
        ll.head = obj.removedublicates(ll.head);
        Node temp = ll.head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        sc.close();
    }
}