//Stack implementation using Linkedlist
//Time complexity - O(1)
//Space complexity - O(1)
package StackQueue.Implementation;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLink {
    Node top;
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value+" pushed to stack");
    }
    public void pop() {
        if(isEmpty()) 
            System.out.println("Stack empty");
        else {
            System.out.println(top.data+" popped from stack");
            top = top.next;
        }
    }
    public void peek() {
        if(isEmpty())
            System.out.println("Stack empty");
        else 
            System.out.println("Peek: "+top.data);
    }
    public boolean isEmpty() {
        return (top==null);
    }
}
class linkedstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLink obj = new StackLink(); 
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.push(val);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(true);
    }
}
