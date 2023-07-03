//Time complexity - O(n)
//Space complexity - O(n)
package String;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        //Reversing string
        String nstr="";
        char ch;
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reversed string: "+nstr);
    }
}
