import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Class used for inputting numbers and counting necessary variables
 */
class Input {

    /**
     * Elements array stores inputted numbers
     */
    private double[] elements;

    Input() {
        String s = input();
        this.elements = toDouble(s);
    }

    /**
     * Method for inputting numbers
     *
     * @return - returns String with numbers
     */
    private static String input() {
        Scanner sc = new Scanner(System.in);
        String m;
        StringBuilder p = new StringBuilder();
        while (true) {
            try {
                do {
                    m = sc.next();
                    p.append(m).append(" ");
                } while (!m.equals("0"));
                return p.toString();
            } catch (Exception ex) {
                System.out.println("Incorrect input");
            }
        }
    }

    /**
     * Method for tokenizing a String and turning into double array
     *
     * @param str - a String for converting
     * @return - returns double array from an initial String
     */
    private double[] toDouble(String str) {
        StringTokenizer stk = new StringTokenizer(str);
        int n = stk.countTokens() - 1;
        String[] tokens = new String[n];
        for (int i = 0; i < n; i++) {
            tokens[i] = stk.nextToken();
        }
        double[] elems = new double[n];
        for (int i = 0; i < n; i++) {
            elems[i] = Double.parseDouble(tokens[i]);
        }
        return elems;
    }

    /**
     * Method for counting the sum of inputted numbers
     *
     * @param arr - array of numbers used for counting the sum of its elements
     * @return - returns the sum
     */
    double sum(double[] arr) {
        double sum = 0;

        for (double v : arr) {
            sum += v;
        }
        return sum;
    }

    double[] getElements() {
        return elements;
    }
}
