import java.util.ArrayList;

public class Gym {


    //fields
    public ArrayList<Member>membersList;
    public int dailyVisitors;
    public int monthlyVisitors;

    public Gym() {
        membersList = new ArrayList<Member>();
        dailyVisitors = 0;
        monthlyVisitors = 0;
    }

    //Getters and Setters

    //Array membersList
    public ArrayList<Member> getMembersList() {

        return membersList;
    }

    public void setMembersList(ArrayList<Member> membersList) {
        this.membersList = membersList;
    }

    //Daily
    public int getDailyVisitors() {
        return dailyVisitors;
    }
    public void setDailyVisitors(int dailyVisitors) {
        this.dailyVisitors = dailyVisitors;
    }

    //Monthly
    public int getMonthlyVisitors() {
        return monthlyVisitors;
    }

    public void setMonthlyVisitors() {
        this.monthlyVisitors = monthlyVisitors;
    }

    public void addMember(Member member) {
        this.membersList.add(member);
    }

    public void removeMember(Member member) {
        this.membersList.remove(member);
    }

    public void incrementDailyVisitors() {
        this.dailyVisitors++;
    }

    public void incrementMonthlyVisitors() {
        this.monthlyVisitors++;
    }


    //Method to add new Member
    public void newMember(Member member) {
        if (membersList.contains(member)) {
            System.out.println("Member already signed to the gym.");
        } else {
            membersList.add(member);
            System.out.println("Member added successfully.");
        }
    }

    public void checkMember(int member_id) {
        for(Member m : membersList) {
            if(m.getMember_id() == member_id) {
                System.out.println("Member id already taken");
            } else if(m.getMember_id() != member_id) {
                System.out.println("Member id not taken");
            }
        }
    }

}