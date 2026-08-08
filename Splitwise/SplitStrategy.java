package Splitwise;

import java.util.ArrayList;

public interface SplitStrategy {
    public boolean splitExpense(Group group, User payer, ArrayList<User> participants, double amount);
} 
