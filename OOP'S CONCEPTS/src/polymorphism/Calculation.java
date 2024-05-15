package polymorphism;
	
//METHOD OVERLOADING

public class Calculation {
	   
	public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public static void main(String[] args) {
	        Calculation calc = new Calculation();
	        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
	        System.out.println("Sum of 3.5 and 7.2: " + calc.add(3.5, 7.2));
	        System.out.println("Sum of 2, 4, and 6: " + calc.add(2, 4, 6));
	    }
	}


