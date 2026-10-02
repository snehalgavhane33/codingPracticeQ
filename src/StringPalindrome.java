package src;
import java.util.*;

public class StringPalindrome {
    public static boolean stringPalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String s = sc.next();

        boolean result = stringPalindrome(s);

        if(result){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
