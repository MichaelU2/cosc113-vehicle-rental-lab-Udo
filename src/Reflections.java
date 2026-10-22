
/*
 * Reflection Questions
 *
 * 1. Why should the fields be private?
 * Making fields private prevents other classes from changing them
 * directly. They must use getters and setters to control the values.
 * For example, setSpeed() prevents negative numbers, and setDoors()
 * only allows 2 or 4 doors. If the fields were public, someone could
 * set car.doors = 7 without any restrictions. This is called encapsulation.
 *
 * 2. What happens if the Car constructor does not call super(...)?
 * Java automatically adds super() if it is not included. However,
 * Vehicle does not have a constructor without parameters. Its
 * constructor requires a brand and a year, so the code will not
 * compile without calling super(brand, year). This also initializes
 * the private brand and year fields in Vehicle.
 *
 * 3. What is the difference between this.type and super.type?
 * The Car class has its own type field, which hides the type field
 * in Vehicle. Both fields exist in a Car object. this.type refers
 * to Car's field, which contains "Car", while super.type refers to
 * Vehicle's field, which contains "Vehicle". The showTypes() method
 * displays both values.
 *
 public class Car extends Vehicle {
*/