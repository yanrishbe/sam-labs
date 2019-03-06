package task5;

import java.util.Arrays;
import java.util.Comparator;

public class DigitSwapper{

    public static String swap(String s){
        s = s.trim();
        String[] arr = s.split(" ");
        Arrays.sort(arr, new DigitComparator());
        return String.join(" ", arr);
    }

   private static class DigitComparator implements Comparator <String> {
       @Override
       public int compare(String o1, String o2) {
           int first = Integer.parseInt(o1);
           int second = Integer.parseInt(o2);
           int sumFirst = 0;
           int sumSecond = 0;
           while (first != 0) {
               sumFirst = first % 10;
               first /= 10;
           }
           while (second != 0){
               sumSecond = second % 10;
               second /= 10;
           }
           return sumFirst - sumSecond;
       }
   }
}
