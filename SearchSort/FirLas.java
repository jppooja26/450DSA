import java.util.Scanner;
import java.util.Arrays;
public class FirLas {
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
        Arrays.sort(arr);
        System.out.print("Sorted array elements: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        int maxi = 0, mini = arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]==k) {
                maxi = Math.max(maxi,i);
                mini = Math.min(mini,i);
            }
        }
        System.out.println("\nMinimum index of "+k+" is "+mini);
        System.out.println("Maximum index of "+k+" is "+maxi);
        sc.close();
    }
} 