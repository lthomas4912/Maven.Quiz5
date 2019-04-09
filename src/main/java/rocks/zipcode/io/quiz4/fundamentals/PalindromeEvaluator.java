package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        List<String> allList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length()-i; j++) {
                if(isPalindrome(string.substring(i,j))){
                    allList.add(string.substring(i, j));
                 }
            }
        }
        return allList.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.equals(reverseString(string))) {
                return true;
            }
        }
        return false;
    }

    public static String reverseString(String string) {
        String result = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            result += string.charAt(i);
         }
        return result;
    }


}
