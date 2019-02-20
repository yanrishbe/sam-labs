import java.util.Scanner;

/**
 * Class checking whether an inputted ticket number is lucky or not
 */
class Lucky {
    /**
     * Stores "lucky" value
     */
    private boolean ch;

    Lucky() {
        ch = check(toArray(input()));
    }

    /**
     * Method for inputting a ticket number
     *
     * @return - returns number
     */
    private static int input() {
        int num;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 999999) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Wrong input! Please try again!");
            }
        }
        return num;
    }

    /**
     * Method checking whether the number is lucky or not
     *
     * @param arr - array storing ticket number
     * @return - returns true if lucky
     */
    private static boolean check(int[] arr) {
        int i = arr[0] + arr[1] + arr[2];
        int k = arr[3] + arr[4] + arr[5];
        return k == i;
    }

    /**
     * Method converting the ticket number into an array
     *
     * @param num - initial ticket number
     * @return - returns ticket number converted into an array
     */
    private int[] toArray(int num) {
        int[] arr = new int[6];
        for (int i = 1; i < 7; i++) {
            arr[i - 1] = num % 10;
            num -= arr[i - 1];
            num /= 10;
        }
        return arr;
    }

    /**
     * Method for printing Lucky class object
     *
     * @return - String with lucky/not lucky value
     */
    @Override
    public String toString() {
        if (ch) {
            return "Lucky ticket!";
        } else {
            return "Sorry, not this time";
        }
    }

}
