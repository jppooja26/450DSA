//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class IndVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Values matching with their index are: ");
        for(int i=0;i<n;i++) {
            if(arr[i]==i)
                System.out.print(i+" ");
        }
        sc.close();
    }
}