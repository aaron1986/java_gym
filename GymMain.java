import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GymMain {
    public static void main(String[] args) {
        Gym gym = new Gym();

        try {
            File file = new File("members.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                String member_id = values[0];
                String member_name = values[1];
                String member_age = values[2];
                String member_gender = values[3];
                String member_address = values[4];
                Member member = new Member(member_id, member_name,member_age, member_gender, member_address);
                gym.addMember(member);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println(gym);
    }
}