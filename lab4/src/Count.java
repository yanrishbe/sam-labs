import java.util.Scanner;

/**
 * Class for counting the amount of money
 */
class Count {

    /**
     * Money to invest
     */
    private double invest;

    /**
     * Stores the amount of months in which the initial investment'll double
     */
    private int months;

    Count() {
        System.out.println("Please input the amount of money you would like to invest");
        this.invest = input();
        System.out.println("Please input the monthly percent");
        double percent = input();

        double x = this.invest;

        do {
            this.invest += (x * (percent / 100));
            this.months++;
        } while (this.invest < x * 2);
    }

    /**
     * method for inputting the amount of money and months
     *
     * @return - returns the inputted integer value
     */
    private static int input() {
        int num;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Wrong input! Please try again!");
            }
        }
        return num;
    }

    int getMonths() {
        return months;
    }

    double getInvest() {
        return invest;
    }
}
