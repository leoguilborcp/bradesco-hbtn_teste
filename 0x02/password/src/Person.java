public class Person {
    public boolean checkUser(String username) {
        if (username == null || username.length() < 8) {
            return false;
        }
        // Verifica se contém apenas letras e números
        return username.matches("[a-zA-Z0-9]+");
    }

    public boolean checkPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");
        return hasUppercase && hasDigit && hasSpecial;
    }
}
