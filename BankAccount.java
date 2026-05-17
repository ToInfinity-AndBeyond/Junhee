public class BankAccount {
    // onwer, balance;
    // deposit, withdraw, getbalance

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    public String getOwner() {
        return owner;
    }

    public String getBalance() {
        return String.format("%.2f", balance);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // deposit: balance에 amount를 더하는 method, amount는 양수여야 함
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + String.format("%.2f", amount) + ", New Balance: " + getBalance());
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current Balance: " + getBalance());
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + String.format("%.2f", amount) + ", New Balance: " + getBalance());
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Junhee", 1000.00);

        System.out.println("Owner: " + account.getOwner() + ", Balance: " + account.getBalance());

        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(1500.00); // Insufficient funds
        account.deposit(-50.00); // Invalid deposit amount
    }


}
