package BankingSystem;

public class SavingsAccount extends Account {

    SavingsAccount(String accountHolder, long accountNo, double balance){
        super(accountHolder,accountNo,balance);
    }

    // public long getAccountNumber(){
    //     return this.accountNo;
    // }

    // public String setAccountNumber(long accountNo){
    //     if(accountNo <= 0){
    //         this.accountNo = 0;
    //         return "Account can never be Zero or negative";
    //     }
    //     this.accountNo = accountNo;
    //     return "Account Number set successfully!";
    // }

    // public String getAccountHolder(){
    //     return this.accountHolder;
    // }

    // public String setAccountHolder(String accountHolder){
    //     if(accountHolder.isEmpty()){
    //         this.accountHolder = "";
    //         return "Please provide a valid name";
    //     }
    //     this.accountHolder = accountHolder;
    //     return "Account Holder set successfully!";
    // }

    // public double getBalance(){
    //     return this.balance;
    // }

    public String withdraw(double value){
        if(this.balance < value){
            return "You don't have enough balance to withdraw.";
        }
        if(this.balance - value < 500){
            return "You don't have enough maintaining balance to withdraw.";
        }
        this.balance = this.balance - value;
        return "Withdrawn successfully! Your current balance is: " +(this.balance); 
    }

}
