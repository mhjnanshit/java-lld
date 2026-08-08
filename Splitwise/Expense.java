package Splitwise;

import java.util.ArrayList;

public class Expense {
    private Group group;
    private double amount;
    private User payer; 
    private ArrayList<User> participants;
    private SplitStrategy splitStrategy;

    public Expense(Group group, double amount, User payer){
        this.group = group;
        this.amount = amount;
        this.payer = payer;
    }

    public void setParticipants(ArrayList<User> participants){
        this.participants = participants;
    }

    public void strategyToSplit(SplitStrategy splitStrategy){
        this.splitStrategy = splitStrategy;
    }

    public boolean splitExpense(){
        return splitStrategy.splitExpense(group, payer, participants, amount);
    }
    
}
