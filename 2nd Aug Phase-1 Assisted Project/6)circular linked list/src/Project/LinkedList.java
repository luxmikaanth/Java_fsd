package Project;

import java.util.Scanner;

class LinkedList 
{ 
    Node head; 
    LinkedList()   { head = null; } 
    void sortedInsert(Node new_node) 
    { 
        Node current = head; 
        if (current == null) 
        { 
            new_node.next = new_node; 
            head = new_node; 
        }
        else if (current.data >= new_node.data) 
        {
            while (current.next != head) 
                current = current.next; 
            current.next = new_node; 
            new_node.next = head; 
            head = new_node; 
        } 
        else
        { 
            while (current.next != head && 
                   current.next.data < new_node.data) 
                current = current.next; 
  
            new_node.next = current.next; 
            current.next = new_node; 
        } 
    } 
    void printList() 
    { 
        if (head != null) 
        { 
            Node temp = head; 
            do
            { 
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            }  while (temp != head); 
        } 
    } 
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList();
        int n,i;
        int []arr=new int [100];
		System.out.print("Enter length of array :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		} 
        Node temp = null; 
        for (i = 0; i < n; i++) 
        { 
            temp = new Node(arr[i]); 
            list.sortedInsert(temp); 
        }
        list.printList(); 
    }
} 
class Node 
{ 
    int data; 
    Node next; 
  
    Node(int d) 
    { 
        data = d; 
        next = null; 
    }
}