//Time complexity - O(nlogn + mlogm)
//Space complexity - O(n + m + union.size() + intersect.size())
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class uni_inter {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter array1 elements: ");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter array2 elements: ");
        int arr2[] = new int[m];
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m) {
            if(arr1[i]<arr2[j]) {
                union.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                union.add(arr2[j]);
                j++;
            }
            else {
                union.add(arr1[i]);
                intersect.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n) {
            union.add(arr1[i]);
            i++;
        }
        while(j<m) {
            union.add(arr2[j]);
            j++;
        }
        System.out.print("Union: ");
        for(i=0;i<union.size();i++) {
            System.out.print(union.get(i)+" ");
        }
        System.out.print("\nIntersect: ");
        for(i=0;i<intersect.size();i++) {
            System.out.print(intersect.get(i)+" ");
        }

    }
}
