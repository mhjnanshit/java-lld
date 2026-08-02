package LibraryManagement;

public class Member {
    private String MemberId;
    private String name;

    public Member(String MemberId, String name){
        this.MemberId = MemberId;
        this.name = name;
    }

    public String getMemberId(){
        return this.MemberId;
    }

    @Override
    public String toString(){
        return "Member Details: " + "(" + this.MemberId + " - " + this.name + ")";
    }

}
