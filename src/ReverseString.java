package src;
import java.util.*;

public class ReverseString {
    public static String reverseString(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            ans.append(s.charAt(i));
        }

    return ans.toString();
    }
     
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        String result = reverseString(s);
        System.out.println("Reverse String : " + result);
        sc.close();
    }
}