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

    void insert(int val)
    {
        Node nn = new Node(val);
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
        return;
    }
}

class Solutions
{
    public Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public Node findmid(Node head)
    {
        Node slow = head;
        Node  fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public int solve(Node head)
    {
        Node first = head;
        Node second = findmid(head);
        Node f = second.next;
        second.next = null;
        f = reverse(f);

        int s = 0;
        int sum = 0;
        while(first!=null && f!=null)
        {
            if(first!=null)
            {
                sum = first.data;
            }
            if(f!=null)
            {
                sum = sum + f.data;
            }
            if(sum>=s)
            {
                s = sum;
            }
            first = first.next;
            f = f.next;
            sum = 0;
        }
        if(first!=null)
        {
            sum = first.data;
            if(sum>=s)
            {
                s = sum;
            }
        }
        if(f!=null)
        {
            sum = f.data;
            if(sum>=s)
            {
                s = sum;
            }
        }
        return s;
    }
   
}
public class tejas1 
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
        sc.close();
        Solutions obj = new Solutions();
        int big = obj.findlarge(ll.head);
        System.out.print(big);
    }
}
