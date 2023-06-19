//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class reverse {
    public static void rev1(int arr[], int n) {
        //store the reversed values in a new array
        int[] arr1 = new int[n];
        int j = 0;
        for(int i=n-1;i>=0;i--) {
            arr1[j] = arr[i];
            j++;
        }
        System.out.print("Reversal 1: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    public static void rev2(int[] arr, int n) {
        //swapping elements
        // 1 2 3 4 5
        for(int i=0;i<n/2;i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.print("Reversal 2: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter length: ");
        Scanner sc = new Scanner(System.in); 
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        rev1(arr,n);
        rev2(arr,n);
        sc.close();
    }
}
