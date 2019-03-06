package task7;

public class SecurePassword {

    public static boolean checkPassword(String str) {
        String REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";
        return str.matches(REGEX);
    }
}
