// Access Level:
// | Modifier  | Same Class | Same Package | Subclass | Other Package  |
// | --------- | ---------- | ------------ | -------- | -------------  |
// | public    | ✔          | ✔            | ✔        | ✔            |
// | protected | ✔          | ✔            | ✔        | ✖            |
// | default   | ✔          | ✔            | ✖        | ✖            |
// | private   | ✔          | ✖            | ✖        | ✖            |
// ----------------------------------------------------------------------

class BankAccount {

    public String bankName = "State Bank";   // public
    private double balance = 5000;           // private
    protected String accountType = "Saving"; // protected
    int accountNumber = 12345;               // default

    // public method
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // private method
    private void showBalance(){
        System.out.println("Balance: " + balance);
    }

    // protected method
    protected void showAccountType(){
        System.out.println("Account Type: " + accountType);
    }

    // default method
    void showAccountNumber(){
        System.out.println("Account Number: " + accountNumber);
    }

    // method to access private method inside class
    public void checkBalance(){
        showBalance();
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        System.out.println(acc.bankName);       // public
        System.out.println(acc.accountType);    // protected
        System.out.println(acc.accountNumber);  // default

        acc.deposit(2000);

        acc.showAccountType();
        acc.showAccountNumber();

        acc.checkBalance();   // calling private method indirectly

        // acc.balance ❌ not accessible (private)
        // acc.showBalance() ❌ not accessible (private)
    }
}