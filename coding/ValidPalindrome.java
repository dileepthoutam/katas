import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ValidPalindrome {

    public static boolean isPalindromeBrute(String s) {
        String newStr = "";
        String reverseStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                newStr += Character.toLowerCase(s.charAt(i));
                reverseStr = Character.toLowerCase(s.charAt(i)) + reverseStr;
            }
        }
        return newStr.equals(reverseStr);
    }

    public static boolean isPalindromeTwoPointer(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) {
                newStr += Character.toLowerCase(s.charAt(i));
            }
        }
        int start = 0;
        int end = newStr.length() - 1;

        while (start <= end) {
            if (newStr.charAt(start) != newStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}

