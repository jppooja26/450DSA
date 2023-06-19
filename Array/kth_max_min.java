//Time complexity - O(nlogn)
//Space complexity - O(n)
import java.util.Scanner;
import java.util.Arrays;
public class kth_max_min {
    public static void main(String[] args) { 
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        } 
        Arrays.sort(arr);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("Kth minimum: "+arr[k-1]);
        System.out.println("Kth maximum: "+arr[n-k]);
        sc.close();
    } 
}
