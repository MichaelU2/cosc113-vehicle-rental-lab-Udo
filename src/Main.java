public class Main {
    public static void main(String[] args) {

        // Create a Vehicle with a brand and year
        Vehicle v = new Vehicle("Tesla", 2024);
        v.describe();

        // Create a Car
        Car c = new Car("Tesla", 2024, 4);
        c.describe();
        c.showTypes();

        // Try an invalid door count
        c.setDoors(3);
        System.out.println("Doors: " + c.getDoors());


        // Create  a ElectricCar
        ElectricCar e = new ElectricCar("Tesla", 2024, 4, 80);
        e.describe();
        e.accelerate(30);
        e.accelerate(20);
        System.out.println("Speed: " + e.getSpeed());
        System.out.println("Battery: " + e.getBatteryLevel() + "%");
    }
}