package assignment01;

public class Driver3 {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.inflate(5);
        System.out.println(balloon.getRadius());
        balloon.inflatePct(100);
        System.out.println(balloon.getRadius());
        System.out.println("Should be about 4189: " + balloon.getVolume());
        balloon.doubleVolume();
        System.out.println("Should be about 8378: " + balloon.getVolume());
    }
}
