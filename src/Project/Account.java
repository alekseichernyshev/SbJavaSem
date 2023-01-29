package Project;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return  balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return balance * (annualInterestRate / 1200);
    }
    public void withDraw(double amount){
        balance -= amount;
    }

    public void deposite(double amount){
        balance +=amount;
    }
}
