//Time complexity - O((r*c)log(r*c))
//Space complexity - O(r*c)
package Matrix;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class row_col_sort {
    public static void sort(int[][] mat,int r,int c) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr.add(mat[i][j]);
            }
        }
        Collections.sort(arr);
        System.out.print("Sorted order: ");
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();
        System.out.println("Enter matrix elements");
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sort(mat,r,c);
        sc.close();
    }
}
