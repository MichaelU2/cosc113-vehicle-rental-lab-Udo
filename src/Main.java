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
    }
}