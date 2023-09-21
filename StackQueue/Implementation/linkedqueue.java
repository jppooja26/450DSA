//Queue implementation using LinkedList
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
class QueueLink {
    Node front;
    Node rear;
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Value dequeued!");
    }
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue empty");
        }
        else {
            System.out.println(front.data+" dequeued");
            front = front.next;
            if(front == null) {
                rear = null;
            }
        }
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Queue empty");
        }
        else {
            System.out.println("Peek: "+front.data);
        }
    }
    public boolean isEmpty() {
        return (front==null && rear==null);
    }
}
public class linkedqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLink obj = new QueueLink();
        do {
            System.out.println("***MENU***");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1: 
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.enqueue(val);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalied choice!");
                    break;
            } 
        } while(true);
    }
}
