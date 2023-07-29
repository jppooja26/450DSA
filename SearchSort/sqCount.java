//Time complexity - O(Sqrt(N))
//Space complexity - O(1)
import java.util.Scanner;
public class sqCount {
    public static int perfectSq(int n) {
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(i*i<n)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int k = perfectSq(n);
        System.out.println("Number of perfect squares: "+k);
        sc.close();
    }
}
