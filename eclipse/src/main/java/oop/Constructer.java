package oop;

public class Constructer extends Throwable {
	
	Constructer(){
		super("dont divide by zero");
		System.out.println("From Constructer");
	}
	
//	public String toString() {
//		return "Kiran"+ super.hashCode();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object o = new Constructer();
			System.out.println(o.toString());
			Throwable obj = new ArithmeticException();
			System.out.println(obj);
			}
}
