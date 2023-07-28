//Time complexity - O(n)
//Space complexity - O(n)
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class duplicate {
    public static int duplicateElement(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>1)
                return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++) {
            arr[i] = sc.nextInt();
        }
        int dup = duplicateElement(arr,n);
        System.out.println("Duplicate element: "+dup);
        sc.close();
    }
}