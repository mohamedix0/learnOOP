package test.project.p1.project2;

public class project2 {

    public static void main(String [] args) {

        Account a1 = new Account("Mohamed",15000d);
        //Account a2 = new Account("Belal",25000d);
        a1.deposit(500);
        a1.displayAccountInfo();
    }

}
