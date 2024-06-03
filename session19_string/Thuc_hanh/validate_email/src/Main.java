public class Main {
    private static Email email;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        email = new Email();
        for (String email1 : validEmail) {
            boolean isValid = email.validate(email1);
            System.out.println("Email is " + email1 + " is valid: " + isValid);
        }
        for (String email2 : invalidEmail) {
            boolean isInvalid = email.validate(email2);
            System.out.println("Email is " + email2 + " is valid: " + isInvalid);
        }
    }
}
