//Time complexity - O(nlogn)
//Space complexity - O(n)
import java.util.Scanner;
import java.util.Arrays;
public class min_max {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Minimum element: "+arr[0]);
        System.out.println("Maximum element: "+arr[n-1]);
        sc.close();
    }
}
