public class Pessoa {
    public static boolean emailValid(String email) {
        if (email == null || email.length() > 50) {
            return false;
        }
        return email.contains("@");
    }
}
