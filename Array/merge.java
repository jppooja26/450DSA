//Time complexity(mergeArray) - O(N+M)
//Space complexity(mergeArray) - O(1)
import java.util.ArrayList;
import java.util.Scanner;
public class merge {
    public static void mergeArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]) {
                arr.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                arr.add(arr2[j]);
                j++;
            }
            else {
                arr.add(arr1[i]);
                arr.add(arr2[j]);
                i++;
                j++;
            }
        }
        while(i<arr1.length) {
            arr.add(arr1[i]);
            i++;
        }
        while(j<arr2.length) {
            arr.add(arr2[j]);
            j++;
        }
        j=0;
        for(int k=0;k<arr1.length;k++) {
            arr1[k] = arr.get(j);
            j++;
        }
        for(int k=0;k<arr2.length;k++) {
            arr2[k] = arr.get(j);
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
