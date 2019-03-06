package task1;

public class Palindrome {

    public static double[] countPalindromes(String s){
        double[] arr = new double[2];
        int count = 0;
        double percent;
        s.trim();
        String[] strArray = s.split(" ");
        for (String val : strArray){
            if (isPalindrome(val)){
                count++;
            }
        }
        percent = (double) count / strArray.length;
        arr[0] = count;
        arr[1] = percent;
        return arr;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuffer().append(str).reverse().toString());
    }

}
