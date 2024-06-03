public class Main {
    private static Account account;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        Account account = new Account();
        for (String account1 : validAccount){
            boolean isValid = account.validate(account1);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account2 : invalidAccount){
            boolean isInvalid = account.validate(account2);
            System.out.println("Account is " + account + " is valid: " + isInvalid);
        }
    }
}