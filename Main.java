public class Main {
    public static void main(String[] args) {

        Member member1 = new Member(6, "bert", 17, 'm', "23 Sesame Street");
        Member member2 = new Member(8, "homer", 17, 'm', "747 Evergreen terrace");
        Member member3 = new Member(2, "jane", 17, 'f', "45 Jungle Lane");
        Member member4 = new Member(12, "ernie", 17, 'm', "23 Sesame Street");

        Gym gym = new Gym();
        gym.addMember(member1);
        gym.addMember(member2);
        gym.addMember(member3);
        gym.addMember(member4);

        System.out.println("Members in Gym ");
        //for (Member m : gym.getMonthlyVisitors()) {
            //System.out.println(m.getId() + " " + m.getName());
        //}
    }
}