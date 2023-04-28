import java.util.ArrayList;

public class Member {
    private String member_id;
    private String member_name;
    private String member_age;
    private String member_gender;
    private String member_address;

    public Member(String member_id, String member_name, String member_age, String member_gender, String member_address) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_age = member_age;
        this.member_gender = member_gender;
        this.member_address = member_address;
    }

    public String getMember_id() {
        return member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public String getMember_age() {
        return member_age;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public String getMember_address() {
        return member_address;
    }
}
