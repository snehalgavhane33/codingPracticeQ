package src;
import java.util.*;


public class ReverseInteger {
    public static int reverseInteger(int n){
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = reverseInteger(n);
        System.out.println("Reversed Integer is: " + result);
    }
}
