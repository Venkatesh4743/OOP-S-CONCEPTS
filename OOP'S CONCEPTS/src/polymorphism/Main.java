package polymorphism;

//MainOverriding2.java (Main class)
public class Main {
 public static void main(String[] args) {
     Vehicle vehicle = new Vehicle();
     vehicle.start(); // Output: Vehicle starts

     Car car = new Car();
     car.start(); // Output: Car starts with ignition
     car.accelerate(); // Output: Car accelerates
 }
}
