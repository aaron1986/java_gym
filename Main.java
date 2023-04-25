import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Member member1 = new Member(6, "bert", 17, "male", "23 Sesame Street");


        Gym gym = new Gym();
        gym.newMember(member1);
        gym.checkMember(16);

        System.out.println();





    }
}