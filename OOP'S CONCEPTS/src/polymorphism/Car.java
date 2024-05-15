package polymorphism;

//Car.java (Child class)
public class Car extends Vehicle {
 @Override
 public void start() {
     System.out.println("Car starts with ignition");
 }

 public void accelerate() {
     System.out.println("Car accelerates");
 }
}

