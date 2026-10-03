package src;
import java.util.*;

public class NumberPalindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;

        }
        return original == rev;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
