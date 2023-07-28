//Time complexity(mergeArray) - O(NlogN)
//Space complexity(mergeArray) - O(1)
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class merge {
    public static void mergeArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            arr.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            arr.add(arr2[i]);
        }
        Collections.sort(arr);
        int j = 0;
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = arr.get(j);
            j++;
        }
        for(int i=0;i<arr2.length;i++) {
            arr2[i] = arr.get(j);
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array1 elements: ");
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter array2 elements: ");
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        mergeArray(arr1,arr2);

        System.out.println("Sorted array elements");
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
