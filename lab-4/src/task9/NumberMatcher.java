package task9;

public class NumberMatcher {

    public static boolean checkNumber(String str) {
        String REGEX = "^(80|\\+?375)(25|29|33|44)\\d{7}$";
        return str.matches(REGEX);
    }
}
