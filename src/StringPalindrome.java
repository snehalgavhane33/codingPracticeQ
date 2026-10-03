package src;
import java.util.*;


//public class StringPalindrome {
//approach1 - Using charAt() with two pointers
   /*  public static boolean stringPalindrome(String s){
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
    } */

//approach2 - Using Character Array
   /*  public static boolean stringPalindrome(String s){
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left] != arr[right]){
                return false;
                }
            left++;
            right--;
        }
        return true;

    } */

   //this main function applicabble to approach 1 and 2
       /*  public static void main(String[] args) {
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
}*/

//approach 3 - Using recursion
/*public class StringPalindrome {

       public static boolean isPalindrome(String s, int left ,int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)!= s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    if(isPalindrome(s, 0, s.length()-1))
        System.out.println("palindrome");
    else
        System.out.println("Not palindrome");
    sc.close();

}
}*/

//Approach 4 - Using StringBuilder
public class StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:");
        String s = sc.nextLine();

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
