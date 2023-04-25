public class Member {

    //fields
    public int member_id;
    public String member_name;
    public int member_age;
    public String member_gender;
    public String member_address;

    //constructor
    public Member(int member_id, String member_name, int member_age, String member_gender, String member_address) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_age = member_age;
        this.member_gender = member_gender;
        this.member_address = member_address;
    }

    //Getters and Setters

    //MemberId
    public int getMember_id() {
        return member_id;
    }
    public void setMember_id(int member_id) {
       this.member_id = member_id;
    }

    //MemberName
    public String getMember_name() {
        return member_name;
    }
    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }
    //MemberAge
    public int getMember_age() {
        return member_age;
    }
    public void setMember_age(int member_age) {
        this.member_age = member_age;
    }
    //MemberGender
    public String getMember_gender() {
        return member_gender;
    }
    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }
    //MemberAddress
    public String getMember_address() {
        return member_address;
    }
    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }


}
