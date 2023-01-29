package Project;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposite(3000);
        System.out.println("Баланс равен " + account.getBalance() + "руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + "руб.");
        System.out.println("Этот счёт был создан " + account.getDateCreated());
    }
}
