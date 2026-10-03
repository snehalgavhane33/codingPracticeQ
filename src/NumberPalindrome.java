package src;
import java.util.*;

//Approach 1 - Reverse Number Approach
/*public class NumberPalindrome {
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
}*/

//Approach 2 - Convert Number to String
public class NumberPalindrome {

    public static boolean isPalindrome(int n){
        String s = String.valueOf(n);
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
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
