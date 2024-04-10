package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User{
    private String Name;
    private int Level;
    private int Power;
    public User(String name, int level, int power) {
        Name = name;
        Level = level;
        Power = power;
    }
    public String getName() {
        return Name;
    }
    public int getPower() {
        return Power;
    }
    public int getLevel() {
        return Level;
    }
}
public class Week04_Ex01 {
    public static void main(String[] args) {
        int totalPower = 0;
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("james", 10, 3000),
                new User("alice", 20, 4000),
                new User("thomas", 15, 3500)
        ));
        System.out.println("[user name]");
        for(User user : users) {
            System.out.println(user.getName());
            totalPower += user.getPower();
        }
        System.out.println();
        System.out.println("[user power 합계]");
        System.out.println(totalPower + "\n");
        System.out.println("[user level 15 이상]");
        for (User user : users) {
            if (user.getLevel() >= 15) {
                String upperCaseName = user.getName().toUpperCase();
                System.out.println(upperCaseName);
            }
        }
    }
}
