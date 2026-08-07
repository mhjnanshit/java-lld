package Splitwise;
import java.util.*;

public class Group {
    private String groupId;
    private ArrayList<User> users;
    private HashMap<User,HashMap<User,Double>> balance;

    public Group(String groupId){
        this.groupId = groupId;
        users = new ArrayList<>();
    }

    public String getGroupId(){
        return this.groupId;
    }

    public void addMember(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addBalance(User creditor, User debtor, double amount){
        if(creditor.getUserId().equals(debtor.getUserId())) return;
        balance.computeIfAbsent(creditor, k -> new HashMap<>())
        .merge(debtor, amount, Double::sum);
    }
}
