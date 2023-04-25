import java.util.ArrayList;

public class Gym {
    private ArrayList<Member> members;
    private int daily_visitors;
    private int monthly_visitors;

    public Gym() {
        members = new ArrayList<Member>();
        daily_visitors = 0;
        monthly_visitors = 0;
    }

    public void addMember(Member member) {
        if (members.contains(member)) {
            System.out.println("Member already signed to the gym.");
        } else {
            members.add(member);
            System.out.println("Member added successfully.");
        }
    }

    // getters and setters for the fields
    public int getDailyVisitors() { return daily_visitors; }
    public void setDailyVisitors(int visitors) { daily_visitors = visitors; }

    public int getMonthlyVisitors() { return monthly_visitors; }
    public void setMonthlyVisitors(int visitors) { monthly_visitors = visitors; }

}
