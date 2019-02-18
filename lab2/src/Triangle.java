import java.util.Scanner;

import static java.lang.Math.sqrt;


/**
 * Class for counting a triangle's perimeter and square
 */
public class Triangle {
    /**
     * a, b, c are a triangle's sides
     */
    private double a;
    private double b;
    private double c;
    private double perimeter;
    private double square;

    private Triangle() {
        System.out.println("Please input triangle coordinates one by one");
        System.out.print("x1: ");
        int x1 = input();
        System.out.print("y1: ");
        int y1 = input();
        System.out.print("x2: ");
        int x2 = input();
        System.out.print("y2: ");
        int y2 = input();
        System.out.print("x3: ");
        int x3 = input();
        System.out.print("y3: ");
        int y3 = input();

        this.a = sideCount(x1, y1, x2, y2);
        this.b = sideCount(x3, y3, x1, y1);
        this.c = sideCount(x3, y3, x2, y2);

        this.perimeter = this.a + this.b + this.c;
        this.square = squareCount(this.a, this.b, this.c, this.perimeter);
    }

    public static void main(String[] args) {
        Triangle tr = new Triangle();
        if (!tr.checkTriangle(tr.a, tr.b, tr.c)) {
            System.out.println("Triangle with such coordinates doesn't exist");
        } else {
            System.out.printf("Perimeter is %.2f\n", tr.perimeter);
            System.out.printf("Square is %.2f\n", tr.square);
        }
    }

    /**
     * method for inputting coordinates
     *
     * @return - returns coordinates
     */
    private int input() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("The coordinate point will be automatically initialized 0");
            return 0;
        }
        return sc.nextInt();
    }

    /**
     * method for counting a side's value
     *
     * @param x1 - coordinate x1
     * @param y1 - coordinate y1
     * @param x2 - coordinate x2
     * @param y2 - coordinate y2
     * @return - returns a side's value
     */
    private double sideCount(int x1, int y1, int x2, int y2) {
        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * method for counting a triangle's square value
     *
     * @param a         - side a
     * @param b         - side b
     * @param c         - side c
     * @param perimeter - perimeter of a triangle
     * @return - returns the square of a triangle
     */
    private double squareCount(double a, double b, double c, double perimeter) {
        double p = perimeter / 2.0;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * method for checking if there is a triangle or not
     *
     * @param a - side a
     * @param b - side b
     * @param c - side c
     * @return - returns boolean value if sides create a triangle or not
     */
    private boolean checkTriangle(double a, double b, double c) {
        return ((a + b) > c) && ((a + c) > b) && ((c + b) > a);
    }

}
