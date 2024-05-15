package abstraction;

//Smartphone.java (Concrete class implementing Phone)
public class Smartphone extends Phone {
 // Implementation for making calls on a smartphone
 @Override
 public void call() {
     System.out.println("Making a call from a smartphone");
 }

 // Implementation for sending texts from a smartphone
 @Override
 public void text() {
     System.out.println("Sending a text from a smartphone");
 }

 // Additional method specific to smartphones
 public void browseInternet() {
     System.out.println("Browsing the internet from a smartphone");
 }
}
