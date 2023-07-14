package String;
import java.util.Scanner;
public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        System.out.print("Enter rotated string: ");
        String str1 = sc.nextLine();
        if(str.length()!= str1.length()) {
            System.out.println(str1+" not a rotated string of "+str);
            System.exit(0);
        }
        String concate = str + str;
        if(concate.contains(str1))
            System.out.println(str1+" is a rotation of "+str);
        else
            System.out.println(str1+" is not a rotation of "+str1);
    }
}
