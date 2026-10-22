public class Car extends Vehicle {

    private int doors;
    String type = "Car";

    public Car(String brand, int year, int doors) {
        super(brand, year);
        setDoors(doors);
    }

    // Getter
    public int getDoors() {
        return doors;
    }

    // Setter: only 2 or 4 allowed
    public void setDoors(int doors) {
        if (doors != 2 && doors != 4) {
            this.doors = doors;
        } else {
            System.out.println("Invalid doors: " + doors + ". Must be 2 or 4.");
        }
    }

    //Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + doors);
    }

    public void showTypes() {
        System.out.println("Car type: " + type);
        System.out.println("Vehicle type: " + super.type);
    }
}