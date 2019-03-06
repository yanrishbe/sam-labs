import task1.Palindrome;
import task10.HtmlChecker;
import task2.StringChecker;
import task3.Counter;
import task4.Swapper;
import task5.DigitSwapper;
import task6.IgnoreLettersSum;
import task7.SecurePassword;
import task8.Mistake;
import task9.NumberMatcher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    Scanner sc = new Scanner(System.in);
                    String source = sc.nextLine();
                    double[] arr = Palindrome.countPalindromes(source);
                    System.out.println("The amount of palindromes " + arr[0] + " Percentage " + arr[1]);
                    break;
                case "2":
                    Scanner sc2 = new Scanner(System.in);
                    String source2 = sc2.nextLine();
                    System.out.println(StringChecker.isSameAsReverse(source2));
                    break;
                case "3":
                    Scanner sc3 = new Scanner(System.in);
                    String source3 = sc3.nextLine();
                    System.out.println("Amount of three-tuples: " + Counter.count(source3));
                    break;
                case "4":
                    Scanner sc4 = new Scanner(System.in);
                    String source4 = sc4.nextLine();
                    System.out.println(Swapper.swapString(source4));
                    break;
                case "5":
                    Scanner sc5 = new Scanner(System.in);
                    String source5 = sc5.nextLine();
                    System.out.println(DigitSwapper.swap(source5));
                    break;
                case "6":
                    Scanner sc6 = new Scanner(System.in);
                    String source6 = sc6.nextLine();
                    System.out.println(IgnoreLettersSum.sum(source6));
                    break;
                case "7":
                    Scanner sc7 = new Scanner(System.in);
                    String source7 = sc7.nextLine();
                    System.out.println(SecurePassword.checkPassword(source7));
                    break;
                case "8":
                    Scanner sc8 = new Scanner(System.in);
                    String source8 = sc8.nextLine();
                    String source81 = sc8.nextLine();
                    String source82 = sc8.nextLine();
                    System.out.println("The string we check " + source82);
                    System.out.println("Even and odd " + source8 + " and " + source81);
                    System.out.println("Check " + Mistake.checkStringCombination(source8, source81, source82));
                    break;
                case "9":
                    Scanner sc9 = new Scanner(System.in);
                    String source9 = sc9.nextLine();
                    System.out.println(NumberMatcher.checkNumber(source9));
                    break;
                case "10":
                    Scanner sc10 = new Scanner(System.in);
                    String source10 = sc10.nextLine();
                    System.out.println(HtmlChecker.removeTags(source10));
                    break;
                default:
                    System.out.println("Program arguments must be wrong!");
            }
        } else {
            System.out.println("Wrong input");
        }

    }
}
