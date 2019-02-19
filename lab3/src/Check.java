import java.util.Scanner;

class Check {
    private String word;

    static int input() {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number from 100 to 999");
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num < 100 || num > 999) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Wrong input! Please try again!");
            }
        }
        return num;
    }

    void check(int num) {
        Number nr = new Number();
        int chNum = num % 100;
        if (chNum == 0) {
            int i = num / 100;
            this.word = nr.getHundreds()[i - 1];
        } else if (chNum % 10 == 0) {
            int i = chNum / 10;
            int k = num / 100;
            this.word = nr.getHundreds()[k - 1];
            this.word += " " + nr.getTens()[i - 1];
        } else if (chNum > 10 && chNum < 20) {
            int i = chNum % 10;
            int k = num / 100;
            this.word = nr.getHundreds()[k - 1];
            this.word += " " + nr.getElevens()[i - 1];
        } else {
            int k = num / 100;
            int i = chNum / 10;
            int m = chNum % 10;
            this.word = nr.getHundreds()[k - 1];
            this.word += " " + nr.getTens()[i - 1];
            this.word += " " + nr.getUnits()[m - 1];
        }
    }

    String getWord() {
        return word;
    }
}
