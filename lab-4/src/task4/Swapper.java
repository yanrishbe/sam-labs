package task4;

public class Swapper {

    public static String swapString(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length / 2;) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            i++;
        }
        return String.join(" ", arr);
    }
}
