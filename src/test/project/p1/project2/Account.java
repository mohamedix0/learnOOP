package test.project.p1.project2;

public class Account {
    static int createAccountNumber = 260;
    private int accountNumber;
    private String ownerName = "";
    private double balance = 0;
    private static Account accounts[] = new Account[100];
    static int accountCounter = 0;

    Account(boolean forArray) {

    }
    Account(String name,double balance) {
        this.accountNumber = createAccountNumber++;
        this.ownerName = name;
        this.balance = balance;
        this.accounts[accountCounter] = new Account(true);
        this.accounts[accountCounter].accountNumber = this.accountNumber;
        this.accounts[accountCounter].balance = this.balance;
        this.accounts[accountCounter].ownerName = this.ownerName;
        accountCounter++;
        createAccountNumber++;
    }

    private void updateAccountData() {
        for (int i = 0;i<accountCounter;i++) {
            if (this.accounts[i].accountNumber == this.accountNumber) {
                this.accounts[i].accountNumber = this.accountNumber;
                this.accounts[i].balance = this.balance;
                this.accounts[i].ownerName = this.ownerName;
                break;
            }
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit " + amount + "$ is successful" +
                "\nYour balance is: " + this.balance + "$");
    }
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdraw " + amount + "$ is successful" +
                "\nYour balance is: " + this.balance + "$");
    }
    public void transfer(Account to,double amount) {
        this.balance -= amount;
        to.balance += amount;
        System.out.println("Transfer " + amount + "$ from " + this.ownerName + "to " + to.ownerName + " is successful");
    }
    public String displayAccountInfo() {
        return "\n------------------------" +
                "\nAccount Info:" +
                "\naccountNumber= " + accountNumber +
                "\nownerName= " + ownerName +
                "\nbalance= " + balance +
                "\n------------------------";
    }
    public Account compare(Account account) {
        if (this.balance == account.balance) {
            System.out.println("This account is equals so i will return first account");
            return this;
        } else if(this.balance > account.balance) {
            return this;
        } else {
            return account;
        }
    }

}
