import java.util.ArrayList;
import java.util.HashMap;

public class Gym {
    private ArrayList<Member> members;
    private int daily_visits;
    private int monthly_visits;

    public Gym() {
        this.members = new ArrayList<>();
        this.daily_visits = 0;
        this.monthly_visits = 0;
    }

    public boolean isMemberSigned(String member_id) {
        for (Member member : members) {
            if (member.getMember_id() == member_id) {
                return true;
            }
        }
        return false;
    }

    public void addMember(Member member) {
        if (!isMemberSigned(member.getMember_id())) {
            this.members.add(member);
        }
    }

    public void removeMember(String member_id) {
        for (Member member : members) {
            if (member.getMember_id() == member_id) {
                this.members.remove(member);
                break;
            }
        }
    }

    public HashMap<String, String> findMemberInfo(int memberId) {
        HashMap<String, String> info = new HashMap<String, String>();
        if (this.members.contains(memberId)) {
            Member member = this.members.get(memberId);
            info.put("name", member.getMember_name());
            info.put("address", member.getMember_address());
        }
        return info;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.getMember_id())
                    .append(",")
                    .append(member.getMember_name())
                    .append(",")
                    .append(member.getMember_age())
                    .append(",")
                    .append(member.getMember_gender())
                    .append(",")
                    .append(member.getMember_address())
                    .append("\n");
        }
        return sb.toString();
    }
}
