//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class larsum {
    public static int largestSum(int[] arr,int n) {
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            mx = Math.max(mx,sum);
            if(sum<0)
                sum=0;
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int val = largestSum(arr,n);
        System.out.println("Largest continuous sum of the array: "+ val);

        sc.close();
    }
}