public class Vehicle {
    private String brand;
    private int year;
    private int speed;
    String type = "Vehicle";

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public void describe() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    public void accelerate(int amount) {
        speed += amount;
    }
}