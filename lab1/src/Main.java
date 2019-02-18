import java.util.Scanner;

/**
 * Main class turning Fahrenheit degrees into Celsius
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input temperature in Fahrenheit degrees");
        if (sc.hasNextDouble()) {
            double tC = (sc.nextDouble() - 32) / 1.8;
            System.out.printf("%.2f", tC);
        } else {
            System.out.println("Wrong input");
        }
    }
}
