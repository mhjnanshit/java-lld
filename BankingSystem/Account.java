package BankingSystem;

public class Account {
    protected long accountNo;
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, long accountNo, double balance){
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    protected String withdraw(double value){
        return "";
    };
    protected boolean deposit(double value){
        this.balance += value;
        return true;
    };
}
