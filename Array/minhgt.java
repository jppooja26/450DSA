//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class minhgt {
    public static int minHeight(int[] arr, int n, int k) {
        int mn,mx;
        int diff = arr[n-1] - arr[0];
        for(int i=1;i<n;i++) {
            mn = Math.min(arr[0]+k,arr[i]-k);
            mx = Math.max(arr[n-1]-k,arr[i]+k);
            diff = Math.min(diff,mx-mn);
        }
        return diff;
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int height = minHeight(arr,n,k);
        System.out.println("Minimum height: "+ height);

        sc.close();
    }
}
