//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
public class sort012 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++) {
            if(arr[i] == 0)
                c0++;
            if(arr[i] == 1) 
                c1++;
            if(arr[i] == 2)
                c2++;
        }
        int i =0;
        while(c0-- > 0) {
            arr[i] = 0;
            i++;
        }
        while(c1-- > 0){
            arr[i] = 1;
            i++;
        }
        while(c2-- > 0) {
            arr[i] = 2;
            i++;
        }

        System.out.print("Array: ");
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
