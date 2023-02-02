package Project;

import java.util.ArrayList;

public class TeatAccountWithTransaction {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(5.5);

        Account account = new Account("David", 1122, 10000);

        account.deposite(300);
        account.deposite(400);
        account.deposite(500);

        account.withDraw(500);
        account.withDraw(400);
        account.withDraw(200);

        System.out.println("Name: " + account.getName());
        System.out.println("Годовая процентная ставка: " + Account.getAnnualInterestRate());
        System.out.println("Balance: " + account.getBalance());

        ArrayList<Transation> transations = account.getTransations();
        System.out.println("\t\t\tДата\t\t\tТип транзакции\tСумма, руб.\tБаланс, руб.");
        for (Transation transation:transations){
            System.out.format("%28s%7c%17.2f%14.2f%n", transation.getDate(),
                    transation.getType(), transation.getAmount(),
                    transation.getBalance());
        }
    }
}
