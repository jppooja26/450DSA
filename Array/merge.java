//Time complexity(mergeArray) - O(n*m)
//Space complexity(mergeArray) - O(1)
import java.util.Scanner;
public class merge {
    public static void mergeArray(int[] arr1, int[] arr2) {
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] <= arr2[j]) {
                i++;
            }
            else {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
                int k=j;
                while(k+1<arr2.length && arr2[k]<arr2[k+1]) {
                    temp = arr2[k];
                    arr2[k] = arr2[k+1];
                    arr2[k+1] = temp;
                    k++;
                }
            }
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
