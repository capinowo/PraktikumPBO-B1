public class MBankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);

        System.out.println("Saldo sebelum transaksi \t\t\t\t: " + b.getBalance());
        b.Deposit(500);
        System.out.println("Deposit sejumlah 500 berhasil. Saldo saat ini \t\t: " + b.getBalance());
        b.Withdraw(200);
        System.out.println("Penarikan sejumlah 200 berhasil. Saldo saat ini \t: " + b.getBalance());
        System.out.println("Saldo setelah transaksi \t\t\t\t: " + b.getBalance());
    }
}
