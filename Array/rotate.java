//Time complexity - O(n+k)
//Space complexity - O(n)
import java.util.ArrayList;
import java.util.Scanner;
public class rotate {
    public static int[] rotation(int n,int[] arr,int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<k;i++) { 
            arr1.add(arr[i]);
        }
        for(int i=k;i<n;i++) {
            arr[i-k] = arr[i];
        }
        int j=0; 
        for(int i=n-k;i<n;i++) {
            arr[i] = arr1.get(j);
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        arr = rotation(n,arr,k);

        System.out.print("Resultant array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
