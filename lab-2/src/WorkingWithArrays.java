import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class WorkingWithArrays {

    private static void task1() {
        int[] arr = new int[100];
        int i = 1;
        int m = 0;
        do {
            if (i % 13 == 0 || i % 17 == 0) {
                arr[m] = i;
                m++;

            }
            i++;
        } while (m < 100);
        out.println(Arrays.toString(arr));
    }

    private static void task2() {
        int maxI = 0, m = 0, minI = 0;
        out.println("Please input array length");
        Scanner sc = new Scanner(System.in);
        int amountOfNumbers = sc.nextInt();
        sc.close();
        int[] arr = new int[amountOfNumbers];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
        out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxI = i;
            }
        }
        out.println("max " + maxI);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minI = i;
            }
        }
        out.println("min " + minI);


        for (int i = 0; i < arr.length; i++) {
            if ((i > minI && i < maxI) || (i > maxI && i < minI)) {
                m += arr[i];
            }
        }
        if (m == 0) {
            out.println("Elements are next to each other, value is 0");
        } else {
            out.println("Value " + m);
        }
    }

    private static void task3() {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                k++;
            }
        }
        if (k == 0) {
            out.println("Prime");
        } else {
            out.println("Not prime");
        }
    }

    private static void task4(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Please input array dimensions");
        int sizeX = sc.nextInt();
        int sizeY = sc.nextInt();
        int[][] arr = new int[sizeX][sizeY];
        int find = Integer.parseInt(args[1]);
        int findX = 0, findY = 0;
        int delta = Integer.parseInt(args[2]);
        for (int i = 0; i < sizeX; i++) {
            for (int k = 0; k < sizeY; k++) {
                arr[i][k] = (int) (100 * Math.random());
            }
        }
        int check = 0;
        for (int[] n : arr) {
            out.println(Arrays.toString(n));
        }

        for (int i = 0; i < sizeX; i++) {
            for (int k = 0; k < sizeY; k++) {
                if (arr[i][k] == find) {
                    findX = i;
                    findY = k;
                    check++;
                    break;
                }
            }
        }
        if (check == 0) {
            out.println("No matches");
        } else {
            out.printf("Found coordinates! %d %d \n", findX, findY);
        }

        int m = 0;
        loop:
        for (int i = 0; i < sizeX; i++) {
            for (int k = 0; k < sizeY; k++) {
                m++;
                if (arr[i][k] == find) {
                    findX = i;
                    findY = k;
                    check++;
                    break loop;
                }
            }
        }
        if (check == 0) {
            out.println("No matches");
        } else {
            out.printf("Found coordinates and iterations! %d %d %d \n", findX, findY, m);
        }

        int check1 = 0;
        for (int i = 0; i < sizeX; i++) {
            for (int k = 0; k < sizeY; k++) {
                if ((arr[i][k] < (find - delta)) || (arr[i][k] > (find + delta))) {
                    check1++;
                }
            }
        }
        out.println(check1);
    }

    private static void task5() {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = 10 + (int) (90 * Math.random());
        }
        out.println(Arrays.toString(arr));
        int[] arr1 = Arrays.copyOf(arr, 4);
        Arrays.sort(arr1);
        out.println(Arrays.toString(arr1));
        if (Arrays.equals(arr, arr1)) {
            out.println("The array is an ascending sequence");
        } else {
            out.println("Sorry");
        }

    }

    private static void task6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][n];
        int i, j;


        for (i = 0; i < arr.length / 2 + 1; i++) { //до середины нечетного и включая середину четного
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j > (arr[i].length - i - 1)))
                    arr[i][j] = " ";
                else
                    arr[i][j] = "*";

            }

        }
        for (i = arr.length - 1; i >= arr.length / 2; i--) { //с конца вверх до середины включительно
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = " ";
                else
                    arr[i][j] = "*";
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                out.print(arr[i][j]);
            }
            out.println(" ");
        }
    }

    private static void task7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][n];
        int i = 0, j = 0;

        while (i < arr.length / 2 + 1) {
            while (j < arr[i].length) {
                if ((j < i) || (j > (arr[i].length - i - 1))) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "*";
                }
                j++;
            }
            i++;
            j = 0;
        }

        i = arr.length - 1;
        j = 0;

        while (i >= arr.length / 2) {
            while (j < arr[i].length) {
                if ((j < arr[i].length - 1 - i) || (j > i)) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "*";
                }
                j++;
            }
            j = 0;
            i--;
        }

        i = 0;
        j = 0;

        while (i < arr.length) {
            while (j < arr[i].length) {
                out.print(arr[i][j]);
                j++;
            }
            out.println(" ");
            j = 0;
            i++;
        }
    }

    private static void task8() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][n];
        int i = 0, j = 0;

        do {
            do {
                if ((j < i) || (j > (arr[i].length - i - 1))) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "*";
                }
                j++;
            } while (j < arr[i].length);
            i++;
            j = 0;
        } while (i < arr.length / 2 + 1);

        i = arr.length - 1;
        j = 0;

        do {
            do {
                if ((j < arr[i].length - 1 - i) || (j > i)) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "*";
                }
                j++;
            } while (j < arr[i].length);
            j = 0;
            i--;
        } while (i >= arr.length / 2);

        i = 0;
        j = 0;

        do {
            do {
                out.print(arr[i][j]);
                j++;
            } while (j < arr[i].length);
            out.println(" ");
            j = 0;
            i++;
        } while (i < arr.length);
    }

    private static void task9() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                "King", "Ace"};
        String[] card = new String[2];
        int i = (int) (13 * Math.random());
        int j = (int) (4 * Math.random());
        card[0] = values[i];
        card[1] = suits[j];
        out.println(card[0] + " of " + card[1]);

    }

    private static void task10() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                "King", "Ace"};
        String[] cards = new String[52];
        for (int k = 0; k < cards.length; ) {
            for (String suit : suits) {
                for (String value : values) {
                    cards[k] = value + " of " + suit;
                    k++;
                }
            }
        }
        out.println(Arrays.toString(cards));
        Random rnd = new Random();
        for (int i = 0; i < cards.length; i++) {
            int j = rnd.nextInt(i + 1);
            String temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        out.println(Arrays.toString(cards));
    }

    public static void main(String[] args) {
        for (String arg : args) {
            out.println(arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4(args);
                    break;
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
                case "7":
                    task7();
                    break;
                case "8":
                    task8();
                    break;
                case "9":
                    task9();
                    break;
                case "10":
                    task10();
                    break;
                default:
                    out.println("Unknown pattern");
            }
        } else {
            out.println("Please input at least one parameter");
        }


    }
}
