/**
 * Class with main method for showing resulting info
 */
public class Main {

    public static void main(String[] args) {
        Input in = new Input();
        System.out.printf("Amount of numbers %d%n", in.getElements().length);
        System.out.printf("Sum of numbers %.2f%n", in.sum(in.getElements()));
        System.out.printf("Arithmetic mean %.2f%n", in.sum(in.getElements()) / in.getElements().length);
    }
}
