import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

class Solution{
	Node swapkthnode(Node head, int n, int k)
    {
		// n is length k is the position
		int first = k; // 2
		int second = (n - k)+1; // 6-2+1 = 5 
        Node dummy = new Node(-1);
        Node prev = dummy;
        Node curr = head; 
        dummy.next = head;

		for(int i = 0 ; i<first-1 ; i++) // 0 
			{
				prev = curr;
				curr = curr.next;
			}
		
		Node left = prev;
		Node s1 = curr;
		Node c1 = curr.next;
		


		prev = dummy;
		curr = head;
        dummy.next = head;
		for(int i = 0 ; i<second-1 ; i++)// 
			{
				prev = curr;
				curr = curr.next;
			}
		
		Node right = prev;
		Node s2 = curr;
		Node c2 = curr.next;
		// 
		left.next = null;
		s1.next = null;
		right.next = null;
		s2.next = null;


		//  here we want to just connect the nodes only

		/// so do it
		left.next = s2;
		s2.next = c1;
		right.next = s1;
		s1.next = c2;
		return dummy.next;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        Solution obj = new Solution();
		list.head = obj.swapkthnode(list.head, n, k);
		Node curr = list.head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
	    }
        input.close();
	}
}