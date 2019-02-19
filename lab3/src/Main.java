public class Main {

    public static void main(String[] args) {
        int m = Check.input();
        Check ch = new Check();
        ch.check(m);
        System.out.println(ch.getWord());
    }
}
