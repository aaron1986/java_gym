public class Member {

    private int member_id;
    private String member_name;
    private int member_age;
    private char member_gender;
    private String member_address;

    public Member(int id, String name, int age, char gender, String address) {
        member_id = id;
        member_name = name;
        member_age = age;
        member_gender = gender;
        member_address = address;
    }

    // getters and setters for the fields
    public int getId() { return member_id; }
    public void setId(int id) { member_id = id; }

    public String getName() { return member_name; }
    public void setName(String name) { member_name = name; }

    public int getAge() { return member_age; }
    public void setAge(int age) { member_age = age; }

    public char getGender() { return member_gender; }
    public void setGender(char gender) { member_gender = gender; }

    public String getAddress() { return member_address; }
    public void setAddress(String address) { member_address = address; }
}
