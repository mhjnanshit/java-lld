package Splitwise;

import java.util.ArrayList;

public class EqualSplit implements SplitStrategy {
    @Override
    public boolean splitExpense(Group group, User payer, ArrayList<User> participants, double amount){
        int size = participants.size();
        if(size == 0) return false;
        double eachSplit = amount / size;
        for(User user: participants){
            if(user.getUserId().equals(payer.getUserId())) continue;
            group.addBalance(payer, user, eachSplit);
        }
        return true;
    }
}
