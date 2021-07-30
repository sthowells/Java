public class Account {
    private static int numAccounts = 0; // instance variable

    // method to count total number of accounts
    public Account(String str) {
        numAccounts++;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    // create accounts and print total number of accounts
    public static void main(String[] args) {
        Account obj;
        obj = new Account("Bob Smith");
        obj = new Account("Ashley Thomas");
        obj = new Account("Matthew Johnson");
        System.out.println("Accounts created: " + Account.getNumAccounts());
    }
}
