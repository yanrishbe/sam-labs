package task6;

public class IgnoreLettersSum {

    public static int sum (String str){
        String[] words = str.split("\\D+");
        int sum = 0;

        for (String word : words) {
            sum += Integer.parseInt(word);
        }
        return sum;
    }
}
