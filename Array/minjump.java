//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class minjump {
    public static int minJump(int[] arr, int n) {
        int mx=0,pos=0,jump=0;
        for(int i=0;i<n;i++) {
            mx = Math.max(mx,i+arr[i]);

            if(pos==i) {
                pos = mx;
                jump++;
            }
            else if(pos>=n-1) 
                return jump;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        
        int jump = minJump(arr,n);
        System.out.println("Minimum jumps: "+jump);
        sc.close();
    }
}