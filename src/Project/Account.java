package Project;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    private String name;
    private ArrayList<Transation> transations = new ArrayList<>();

    public Account(){
        dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /**
     * создаёт банковский счёт с указанным именем владельца счёта
     * @return
     */
    public Account(String name, int id, double balance){
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public ArrayList<Transation> getTransations() {
        return transations;
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
        transations.add(new Transation('-', amount, balance, ""));
    }

    public void deposite(double amount){
        balance +=amount;
        transations.add(new Transation('+', amount, balance, ""));
    }
}
