
// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.speedUp();
        System.out.println("Viteza mașinii: " + car.getSpeed());

        bicycle.speedUp();
        System.out.println("Viteza bicicletei: " + bicycle.getSpeed());
    }
}

