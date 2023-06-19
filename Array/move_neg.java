//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;

public class move_neg {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        //Two pointer method
        int i=0,j=n-1;
        while(i<j) {
            if(arr[i]>=0 && arr[j]<0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i]<0)
                i++;
            else
                j--;
        }
        System.out.print("Resultant array: ");
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
