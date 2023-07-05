//Time complexity - O(n)
//Space complexity - O(n)
package String;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }

        System.out.println("Duplicate characters");
        for(Map.Entry entry: map.entrySet()) {
            if((int)entry.getValue()>1) {
                System.out.print(entry.getKey()+"->"+entry.getValue());
                System.out.println();
            }
        }
    }
}
