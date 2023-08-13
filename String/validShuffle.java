package String;
import java.util.Scanner;
class validShuffle {
    public static boolean isValid(String a, String b, String c) { 
        //Time complexity - O(c.length)
        //Space complexity - O(1)
        int i=0,j=0,k=0;
        while(k<c.length()) {
            if(i<a.length() && a.charAt(i)==c.charAt(k))
                i++;
            else if(j<b.length() && b.charAt(j)==c.charAt(k))
                j++;
            else
                return false;
            k++;
        }
        return (i==a.length() && j==b.length() && k==c.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String a = sc.nextLine();
        System.out.print("Enter string 2: ");
        String b = sc.nextLine();
        System.out.print("Enter shuffled string: ");
        String c = sc.nextLine();
        boolean res = isValid(a,b,c);
        if(res)
            System.out.println("Valid Shuffle");
        else
            System.out.println("Not a valid shuffle");
        sc.close();
    }
}