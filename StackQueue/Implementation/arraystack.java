//Stack implementation using array 
//Time complexity - O(1)
//Space complexity - O(n)
package StackQueue.Implementation;
import java.util.Scanner;
class Stack {
    int maxSize;
    int top;
    int[] stack;
    public Stack(int n) {
        maxSize = n;
        top=-1;
        stack = new int[n];
    } 
    public void push(int data) {
        if(isFull())
            System.out.println("Stack full");
        else {
            stack[++top] = data;
            System.out.println(data+" added to stack");
        }
    }
    public boolean isFull() {
        return (top==maxSize-1);
    }
    public void pop() {
        if(isEmpty())
            System.out.println("Stack empty");
        else
            System.out.println(stack[top--]+" popped from stack");
    }
    public void peek() {
        if(isEmpty())
            System.out.println("Stack empty");
        else
            System.out.println("Peek: "+ stack[top]);
    }
    public boolean isEmpty() {
        return (top==-1);
    }
}
public class arraystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack obj = new Stack(5);
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
            System.out.print("Enter choice: ");
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
        } while(true);
    }
}
