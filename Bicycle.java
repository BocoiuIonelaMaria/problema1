
// Bicycle.java
public class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        // Logica specifică pentru creșterea vitezei la bicicletă
        int speedIncrease = 5;
        setSpeed(getSpeed() + speedIncrease);
        printSpeedIncrease("Bicicletă", speedIncrease);
    }
}

