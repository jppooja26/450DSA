//Time complexity - O(n)
//Space complexity - O(n)
package String;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        boolean found = false;
        int n=str.length();
        for(int i=0;i<n/2;i++) {
            if(str.charAt(i)!=str.charAt(n-i-1)) {
                found = true;
                System.out.println(str+" is not a palindrome");
                break;
            }
        }
        if(found==false)
            System.out.println(str+" is a palindrome");
    }
}
