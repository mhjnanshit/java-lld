package BankingSystem;

public class CurrentAccount extends Account {
    CurrentAccount(String accountHolder, long accountNo, double balance){
        super(accountHolder,accountNo,balance);
    }

    public String withdraw(double value){

        if(this.balance - value < -20000){
            return "You don't have enough Overdraft to withdraw.";
        }
        this.balance = this.balance - value;
        return "Withdrawn successfully! Your current balance is: " +(this.balance); 
    }

}
