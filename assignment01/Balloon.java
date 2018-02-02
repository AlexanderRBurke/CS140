package assignment01;

public class Balloon {
    private double radius = 0.0;

    public void inflate(double amount){
        radius += amount;
    }

    public void inflatePct(double amount){
        radius = radius*(1+amount/100);
    }

    public double getVolume(){
        return 4 * Math.PI * radius* radius* radius / 3;
    }

    public void doubleVolume(){
        radius = Math.cbrt((2*3*this.getVolume())/(4*Math.PI));
    }

    public double getRadius() {
        return radius;
    }
}
