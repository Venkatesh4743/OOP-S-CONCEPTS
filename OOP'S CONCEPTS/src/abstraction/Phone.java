package abstraction;

//Abstract class
public abstract class Phone {
 // Abstract method for making calls
 public abstract void call();

 // Abstract method for sending texts
 public abstract void text();
}
//We cannot override static methods to achieve method overriding
//We cannot override private methods to achieve method overriding
//We cannot override final methods to achieve method overriding