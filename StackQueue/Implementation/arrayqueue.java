//Queue implementation using array
//Time complexity - O(1)
//Space complexity - O(1)
package StackQueue.Implementation;
import java.util.Scanner;
class Queue {
    int[] queue;
    int front;
    int rear;
    int size;
    public Queue(int n) {
        front = 0;
        rear = -1;
        queue = new int[n];
        size = 0;
    }
    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear+1)%queue.length;
        queue[rear] = data;
        size++;
        System.out.println(data+" added to queue");
    }
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(queue[front]+" removes from queue");
        front = (front+1)%queue.length;
        size--;
    }
    public void peek() {
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Peek: "+queue[front]);
    }
    public void len() {
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println("Size: "+size);
    }
    public boolean isFull() {
        return (size == queue.length);
    }
    public boolean isEmpty() {
        return (size == 0);
    }
}
public class arrayqueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue obj = new Queue(5);
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Queue size\n5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch) {
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
                    obj.len();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while(true);
    }
}
