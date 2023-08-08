package Matrix;
import java.util.Scanner;
public class max1_row {
    public static int max_row(int[][] mat) { //Time complexity - O(r*c), Space complexity - O(1)
        int row = 0;
        int max = 0;
        for(int i=0;i<mat.length;i++) {
            int count = 0;
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j] == 1)
                    count++;
            }
            if(max<count) {
                max = count;
                row = i;
            }
        }
        return row;
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
        int row = max_row(mat);
        System.out.println("Row with maximum 1: "+row);
    }
}
