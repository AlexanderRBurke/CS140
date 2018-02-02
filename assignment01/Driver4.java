package assignment01;

public class Driver4 {
    public static void main(String[] args) {
        Name alex = new Name("Alex");
        Name henry = new Name("Henry");
        Name nick = new Name("Nick");
        alex.befriend(henry);
        System.out.println(alex.getFriendCount());
        alex.befriend(nick);
        System.out.println(alex.getFriendCount());
        alex.unfriend(henry);
        System.out.println(alex.getFriendNames());
    }


}
