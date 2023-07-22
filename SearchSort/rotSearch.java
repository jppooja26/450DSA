import java.util.Scanner;
public class rotSearch {
    //Time complexity - O(logn)
    //Space complexity - O(n)
    public static int search(int[] arr, int k) {
        int start = 0,end = arr.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==k)
                return mid;
            if(arr[start]<=arr[mid]) {
                if(arr[start]<=k && arr[mid]>=k)
                    end = mid-1;
                else
                    start = mid+1;
            }
            else {
                if(arr[end]>=k && arr[mid]<=k)
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter rotated array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int k = sc.nextInt();
        int pos = search(arr,k);
        System.out.print("Position: "+pos);
    }
}
