public class BankAccount {
    
    private float balance;
    public float uang;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(float initialBalance) {
        balance = initialBalance;
    }

    public void Deposit(float uang) {
        balance = balance + uang;
    }

    public void Withdraw(float uang) {
        balance = balance - uang;
    }

    public float getBalance() {
        return balance;
    }
}