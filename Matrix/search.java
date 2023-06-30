package Matrix;
import java.util.Scanner;

public class search {
    public static void search_ele(int[][] mat,int x) {
        boolean found = false;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j] == x) {
                    found = true;
                    System.out.print("Searched value is at "+(i+1)+"th row and "+(j+1)+"th column");
                }
            }
        }
        if(!found)
            System.out.print("Value not found!");

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
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt();
        search_ele(mat,x);
    }
}
