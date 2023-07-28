//Time complexity - O(n)
//Space complexity - O(1)
import java.util.Scanner;
public class kadane {
    public static int maxSum(int[] arr) {
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
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
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int sum = maxSum(arr);
        System.out.println("Largest contiguous sum of array: "+sum);
        sc.close();
    }
}
