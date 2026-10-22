public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);
        setBatteryLevel(batteryLevel);
    }

    // Getter
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Setter: only 0 to 100 allowed
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level: " + batteryLevel + ". Must be 0-100.");
        }
    }

    // Use battery when accelerating

    public void accelerate(int amount) {
        super.accelerate(amount);
        if (batteryLevel > 0) {
            batteryLevel--;
        }
    }

    // Add battery level to the description

    public void describe() {
        super.describe();
        System.out.println("Battery: " + batteryLevel + "%");
    }
}