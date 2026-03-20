package test.project.p1.project2;

public class project2 {

    public static void main(String [] args) {

        Account a1 = new Account("Mohamed",12000d);
        Account a2 = new Account("Belal",24000d);
        Account a3 = new Account("Osama",6000d);
        a1.deposit(500);
        a2.transfer(a3,1660);
        a3.transfer(a1,250);
        a1.deposit(5400);
        a1.withdraw(400);
        System.out.println("Winner is: " + a1.compare(a2).getName());

        for(int i = 0;i<Account.accountCounter;i++) {
                System.out.println(Account.accounts[i].displayAccountInfo());
        }

    }
}
