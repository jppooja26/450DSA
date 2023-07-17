//Recursive approach
//Time complexity - O(n)
//Space complexity - O(n)
package LinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class rev2 {
    public static Node reverse(Node head) {
        if(head == null || head.next == null) 
            return head;
        Node reversedHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversedHead;
    }
    public static void display(Node head) {
        Node current = head;
        System.out.print("Elements: ");
        while(current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Linkedlist elements(-1 to exit): ");
        int e = sc.nextInt();
        Node head = new Node(e);
        Node current = head;
        while(true) {
            e = sc.nextInt();
            if(e==-1)
                break;
            Node newNode = new Node(e);
            current.next = newNode;
            current = current.next;
        }
        System.out.println("Initially");
        display(head);

        Node reversedHead = reverse(head);
        System.out.println("After reversing");
        display(reversedHead);
    }
}
