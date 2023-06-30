//Time complexity - O(r*c)
//Space complexity - O(r*c)
package Matrix;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class median {
    public static int find(int[][] mat) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                arr.add(mat[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get((((mat.length*mat[0].length)+1)/2)-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) { 
                mat[i][j] = sc.nextInt();
            }
        }
        int val = find(mat);
        System.out.print("Median: "+val);
    }
}
