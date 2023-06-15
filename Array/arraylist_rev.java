import java.util.*;
public class arraylist_rev {
    public static void rev1(ArrayList<Integer> arr){
        //Store the reverese values in a new ArrayList
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--) {
            arr1.add(arr.get(i));
        }
        System.out.print("\nReversal 1: ");
        for(int i=0;i<arr1.size();i++) {
            System.out.print(arr1.get(i)+" ");
        }
        System.out.println();
    }
    public static void rev2(ArrayList<Integer> arr) {
        //Swap the elements
        int n = arr.size();
        for(int i=0;i<n/2;i++) {
            int temp = arr.get(i);
            arr.set(i,arr.get(n-i-1));
            arr.set(n-i-1,temp);
        }
        System.out.print("Reversal 2: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter elements(-1 for exit): ");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int e = sc.nextInt();
            if(e == -1)
                break;
            arr.add(e);
        }

        System.out.print("Array elements: ");
        Iterator<Integer> ii = arr.iterator();
        while(ii.hasNext()) {
            System.out.print(ii.next()+" ");
        }

        rev1(arr);
        rev2(arr);
        sc.close();
    }
}
