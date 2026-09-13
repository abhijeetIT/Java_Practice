package src.main.java.JavaBasic.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String originalStr = sc.next().toLowerCase();

        int start = 0;
        int end = originalStr.length()-1;
        boolean isPalindrome=true;

        while(start < end){
            if(originalStr.charAt(end) != originalStr.charAt(start)){
               isPalindrome = false;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("its a palindrome");
        }else{
            System.out.println("its Not palindrome");  
        }
/* ✔ No StringBuilder
✔ No StringBuffer
✔ No reverse string
✔ No extra memory
✔ No immutability problem
✔ Time: O(n)
✔ Space: O(1)
*/
    }
}
