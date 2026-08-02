package BankingSystem;

public class main {
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount("Anshit",12020,500);
        CurrentAccount current = new CurrentAccount("Mahajan",12021,1000);

        System.out.println(savings.withdraw(2000));

        System.out.println(savings.deposit(1600));
        System.out.println(savings.withdraw(2000));
        System.out.println(savings.withdraw(1600));

        System.out.println(savings.deposit(2000));
        System.out.println(savings.withdraw(1600));
        System.out.println(savings.withdraw(300));
        
        System.out.println(current.withdraw(2000));

        System.out.println(current.deposit(1600));
        System.out.println(current.withdraw(20001));
        System.out.println(current.withdraw(1600));

        System.out.println(current.deposit(2000));
        System.out.println(current.withdraw(1600));
        System.out.println(current.withdraw(300));

    }
}
