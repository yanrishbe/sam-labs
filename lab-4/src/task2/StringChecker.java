package task2;

import task1.Palindrome;

import java.util.Arrays;

public class StringChecker {

    public static boolean isSameAsReverse(String str){
        //str.trim();
        String[] strArray = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String val : strArray){
            sb.append(val);
        }
        return Palindrome.isPalindrome(sb.toString());
    }
}
