
// Car.java
public class Car extends Vehicle {
    @Override
    public void speedUp() {
        // Logica specifică pentru creșterea vitezei la mașină
        int speedIncrease = 10;
        setSpeed(getSpeed() + speedIncrease);
        printSpeedIncrease("Mașină", speedIncrease);
    }
}

