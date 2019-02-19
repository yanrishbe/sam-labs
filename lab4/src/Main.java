/**
 * Class for showing the resulting amount of money with main method
 */
public class Main {

    public static void main(String[] args) {
        Count ct = new Count();
        System.out.printf("The amount of money you'll get in %d month(s) is %.2f", ct.getMonths(), ct.getInvest());
    }
}
